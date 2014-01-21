package lolLib;

import java.awt.image.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.apache.commons.lang3.StringUtils;

public class DataDragon {
	private String gameVersion;
	
	public DataDragon(String version) {
		this.setGameVersion(version);
	}

	public BufferedImage getItemImage(int itemId) {
		try {
			URL itemUrl = buildUrl("item", String.valueOf(itemId));
			BufferedImage image = ImageIO.read(itemUrl);
			return image;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public BufferedImage getChampionImage(String championName) {
		try {
			URL championUrl = buildUrl("champion", StringUtils.capitalize(championName));
			BufferedImage image = ImageIO.read(championUrl);
			return image;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public BufferedImage getRuneImage(int runeId) {
		try {
			URL runeUrl = buildUrl("rune", String.valueOf(runeId));
			BufferedImage image = ImageIO.read(runeUrl);
			return image;
		} catch(IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public BufferedImage getMasteryImage(int masteryId) {
		try {
			URL masteryUrl = buildUrl("rune", String.valueOf(masteryId));
			BufferedImage image = ImageIO.read(masteryUrl);
			return image;
		} catch(IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	// JSON Data: http://ddragon.leagueoflegends.com/cdn/4.1.2/data/en_US/champion/Ahri.json
	
	public String getGameVersion() {
		return gameVersion;
	}

	public void setGameVersion(String gameVersion) {
		this.gameVersion = gameVersion;
	}
	
	private URL buildUrl(String type, String id) {
		try {
			URL url = new URL("http://ddragon.leagueoflegends.com/cdn/" + gameVersion + "/img/" + type + "/" + id + ".png");
			return url;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
