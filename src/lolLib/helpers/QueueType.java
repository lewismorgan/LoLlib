package lolLib.helpers;

public enum QueueType {
	NORMAL_5V5_BLIND(2),
	RANKED_SOLO_5V5(4),
	COOP_VS_AI_5V5(7),
	NORMAL_3V3(8),
	NORMAL_5V5_DRAFT(14),
	DOMINION_5V5_BLIND(16),
	DOMINION_5V5_DRAFT(17),
	DOMINION_COOP_VS_AI(25),
	RANKED_TEAM_3V3(41),
	RANKED_TEAM_5V5(42),
	TWISTED_TREELINE_COOP_VS_AI(52),
	ARAM(65),
	ARAM_COOP_VS_AI(67),
	ONE_FOR_ALL_5V5(70),
	SNOWDOWN_SHOWDOWN_1V1(72),
	SNOWDOWN_SHOWDOWN_2V2(73);
	
	private int type;
	
	private QueueType(int type) {
		this.type = type;
	}
	
	public int get() {
		return type;
	}
}
