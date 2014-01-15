package lolLib.objects.stats;

import java.util.List;

public class PlayerStatsSummaryList {
	private List<PlayerStatsSummary> playerStatsSummaries;
	private long summonerId;
	
	public List<PlayerStatsSummary> getPlayerStatsSummaries() {
		return playerStatsSummaries;
	}
	public void setPlayerStatsSummaries(
			List<PlayerStatsSummary> playerStatsSummaries) {
		this.playerStatsSummaries = playerStatsSummaries;
	}
	public long getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}
}
