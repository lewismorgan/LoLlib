package lolLib.objects;

public class MiniSeries {
	
	private int losses;
	private String progress;
	private int target;
	private long timeLeftToPlayMillis;
	private int wins;
	
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public char[] getProgress() {
		return progress.toCharArray();
	}
	public void setProgress(String progress) {
		this.progress = progress;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	public long getTimeLeftToPlayMillis() {
		return timeLeftToPlayMillis;
	}
	public void setTimeLeftToPlayMillis(long timeLeftToPlayMillis) {
		this.timeLeftToPlayMillis = timeLeftToPlayMillis;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
}
