package lolLib.objects;

public class LeagueSummoner {
	
	private boolean isFreshBlood;
	private boolean isHotStreak;
	private boolean isInactive;
	private boolean isVeteran;
	private long lastPlayed;
	private String leagueName;
	private String leaguePoints;
	private MiniSeries miniSeries;
	private String playerTeamId;
	private String playerTeamName;
	private String queueType;
	private String rank;
	private String tier;
	private int wins;
	
	public LeagueSummoner() {
		
	}
	
	public boolean isFreshBlood() {
		return isFreshBlood;
	}
	public void setFreshBlood(boolean isFreshBlood) {
		this.isFreshBlood = isFreshBlood;
	}
	public boolean isHotStreak() {
		return isHotStreak;
	}
	public void setHotStreak(boolean isHotStreak) {
		this.isHotStreak = isHotStreak;
	}
	public boolean isInactive() {
		return isInactive;
	}
	public void setInactive(boolean isInactive) {
		this.isInactive = isInactive;
	}
	public boolean isVeteran() {
		return isVeteran;
	}
	public void setVeteran(boolean isVeteran) {
		this.isVeteran = isVeteran;
	}
	public long getLastPlayed() {
		return lastPlayed;
	}
	public void setLastPlayed(long lastPlayed) {
		this.lastPlayed = lastPlayed;
	}
	public String getLeagueName() {
		return leagueName;
	}
	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}
	public String getLeaguePoints() {
		return leaguePoints;
	}
	public void setLeaguePoints(String leaguePoints) {
		this.leaguePoints = leaguePoints;
	}
	public MiniSeries getMiniSeries() {
		return miniSeries;
	}
	public void setMiniSeries(MiniSeries miniSeries) {
		this.miniSeries = miniSeries;
	}
	public String getPlayerTeamId() {
		return playerTeamId;
	}
	public void setPlayerTeamId(String playerTeamId) {
		this.playerTeamId = playerTeamId;
	}
	public String getPlayerTeamName() {
		return playerTeamName;
	}
	public void setPlayerTeamName(String playerTeamName) {
		this.playerTeamName = playerTeamName;
	}
	public String getQueueType() {
		return queueType;
	}
	public void setQueueType(String queueType) {
		this.queueType = queueType;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getTier() {
		return tier;
	}
	public void setTier(String tier) {
		this.tier = tier;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
}
