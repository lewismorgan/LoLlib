package lolLib.helpers;

public enum MapType {
	SUMMONERS_RIFT_SUMMER(1),
	SUMMONERS_RIFT_AUTUMN(2),
	THE_PROVING_GROUNDS(3),
	TWISTED_TREELINE_OLD(4),
	THE_CRYSTAL_SCAR(8),
	TWISTED_TREELINE(10),
	HOWLING_ABYSS(12);
	
	private int mapType;
	
	private MapType(int mapType) {
		this.mapType = mapType;
	}
	
	public int get() {
		return mapType;
	}
}
