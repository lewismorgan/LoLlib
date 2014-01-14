package lolLib.helpers;

public enum Region {
	NA, 
	EUW, 
	EUNE;
	
	@Override
	public String toString() {
		switch(ordinal()) {
			default:
				return "na";
			case 0:
				return "na";
			case 1:
				return "euw";
			case 2:
				return "eune";
		}
	}
}
