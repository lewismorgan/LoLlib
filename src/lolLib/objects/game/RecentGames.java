package lolLib.objects.game;

import java.util.Set;

public class RecentGames {
	private Set<Game> games;
	private long summonerId;
	
	public Set<Game> getGames() {
		return games;
	}
	public void setGames(Set<Game> games) {
		this.games = games;
	}
	public long getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}
}
