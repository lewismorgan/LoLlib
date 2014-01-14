package lolLib.objects;

public class Summoner {
	private long id;
	private String name;
	private int profileIconId;
	private long revisionDate;
	private long summonerLevel;
	
	public Summoner() {
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getProfileIcon() {
		return profileIconId;
	}
	public void setProfileIcon(int profileIcon) {
		this.profileIconId = profileIcon;
	}
	public long getRevisionDate() {
		return revisionDate;
	}
	public void setRevisionDate(long revisionDate) {
		this.revisionDate = revisionDate;
	}
	public long getLevel() {
		return summonerLevel;
	}
	public void setLevel(long level) {
		this.summonerLevel = level;
	}
}
