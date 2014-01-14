package lolLib;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import lolLib.helpers.Region;
import lolLib.objects.League;
import lolLib.objects.Summoner;
import lolLib.objects.SummonerList;
import lolLib.objects.SummonerRunes;
import lolLib.objects.champion.Champion;
import lolLib.objects.champion.ChampionList;
import lolLib.objects.game.RecentGames;
import lolLib.objects.masteries.MasteryPages;

public class LoLApi {

	private String apiKey;
	private String region;
	private Gson gson = new Gson();
	private static LoLApi instance;
	
	public LoLApi(Region region, String key) {
		this.apiKey = key;
		this.region = region.toString();
		setInstance(this);
	}
	
	public LoLApi(String region, String key) {
		this.apiKey = key;
		this.region = region;
		setInstance(this);
	}
	
	private static String downloadJson(String sUrl) throws IOException {
		BufferedReader reader = null;
		try {
			
			URL url = new URL(sUrl);
			reader = new BufferedReader(new InputStreamReader(url.openStream()));
			StringBuffer buffer = new StringBuffer();
			int read;
			char[] chars = new char[1024];
			
			while ((read = reader.read(chars)) != -1) {
				buffer.append(chars, 0, read);
			}
			//System.out.println(buffer.toString());
			return buffer.toString();
			
		} finally {
			if (reader != null) {
				reader.close();
			}
		}
	}
	
	private String request(String path, String version, boolean base){

		try {
			if (base == false) {
				String json = downloadJson("http://prod.api.pvp.net/api/lol/" + region.toString() + "/" + version + "/" + path + "?api_key=" + apiKey);
				return json;
			} else {
				String json = downloadJson("http://prod.api.pvp.net/api/lol/" + region.toString() + "/" + version + "/" + path + "&api_key=" + apiKey);
				return json;
			}
		} 
		
		catch (IOException e) { e.printStackTrace(); }
		
		return null;
	}
	
	private String request(String path, String version) {
		return request(path, version, false);
	}

	
	/**
	 * Gets a {@link Summoner} by the name.
	 * @param name Name of the summoner.
	 * @return {@link Summoner}
	 */
	public Summoner getSummoner(String name) {
		Summoner summoner = gson.fromJson(request("summoner/by-name/" + name, "v1.2"), Summoner.class);

		return summoner;
	}
	
	/**
	 * Gets a {@link Summoner} by the id.
	 * @param summonerId Id of the summoner
	 * @return {@link Summoner}
	 */
	public Summoner getSummoner(long summonerId) {
		Summoner summoner = gson.fromJson(request("summoner/" + summonerId, "v1.2"), Summoner.class);

		return summoner;
	}
	
	/**
	 * Gets {@link SummonerList} through an array of ids. Note that this will only
	 * return their names. There is a limit of 40, restricted by the Riot API.
	 * @param summonerIds Ids of the summoners.
	 * @return {@link SummonerList}
	 */
	public SummonerList getSummoners(long... summonerIds) {
		
		if (summonerIds.length > 40)
			return null;
		
		String formattedList = String.valueOf(summonerIds[0]);
		
		for(int i = 1; i < summonerIds.length; i++) {
			formattedList = formattedList + ", " + String.valueOf(summonerIds[i]);
		}
		
		SummonerList summonerList = gson.fromJson(request("summoner/" + formattedList + "/name", "v1.2"), SummonerList.class);
		
		return summonerList;
	}
	
	/**
	 * Gets the {@link SummonerRunes} of a summoner based on the id.
	 * @param summonerId ID of the Summoner
	 * @return {@link SummonerRunes}
	 * @see RunePage
	 * @see RuneSlot
	 * @see Rune
	 */
	public SummonerRunes getSummonerRunes(long summonerId) {
		SummonerRunes sRunes = gson.fromJson(request("summoner/" + summonerId + "/runes", "v1.2"), SummonerRunes.class);
		return sRunes;
	}

	/**
	 * Gets the {@link MasteryPages} of a summoner based on the id.
	 * @param summonerId ID of the summoner
	 * @return {@link MasteryPages}
	 * @see MasteryPage
	 * @see Talents
	 */
	public MasteryPages getMasteries(long summonerId) {
		MasteryPages pages = gson.fromJson(request("summoner/" + String.valueOf(summonerId) + "/masteries", "v1.2"), MasteryPages.class);
		return pages;
	}
	
	/**
	 * Gets the {@link League}s of a summoner based on the id.
	 * @param summonerId ID of the summoner
	 * @return {@link Map}<{@link String}, {@link League}>
	 * @see League
	 * @see LeagueSummoner
	 */
	public Map<String, League> getLeagues(long summonerId) {
		Map<String, League> leagues = gson.fromJson(request("league/by-summoner/" + String.valueOf(summonerId), "v2.2"), new TypeToken<Map<String, League>>(){}.getType());
		return leagues;
	}
	
	/**
	 * Gets the {@link RecentGames} of a summoner based on the id.
	 * @param summonerId ID of the summoner
	 * @return RecentGames
	 * @see RawStats
	 * @see Game
	 * @see Player
	 */
	public RecentGames getRecentGames(long summonerId) {
		RecentGames rGames = gson.fromJson(request("game/by-summoner/" + String.valueOf(summonerId) + "/recent", "v1.3"), RecentGames.class);
		return rGames;
	}
	
	/**
	 * Gets a {@link List} of {@link Champion}s from the Riot API.
	 * @return {@link List}<{@link Champion}>
	 * @see Champion
	 */
	public List<Champion> getChampions() {
		ChampionList champions = gson.fromJson(request("champion", "v1.1"), ChampionList.class);
		
		return champions.getChampions();
	}
	
	/**
	 * Gets a {@link List} of free {@link Champion}s from the Riot API.
	 * @return {@link List}<{@link Champion}>
	 * @see Champion
	 */
	public List<Champion> getFreeChampions() {
		ChampionList freeChamps = gson.fromJson(request("champion?freeToPlay=true", "v1.1", true), ChampionList.class);
		return freeChamps.getChampions();
	}
	
	public static LoLApi getInstance() {
		return instance;
	}

	public static void setInstance(LoLApi instance) {
		LoLApi.instance = instance;
	}

}
