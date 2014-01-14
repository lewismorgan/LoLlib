package lolLib.objects;

import java.util.Set;

import lolLib.objects.runes.RunePage;

public class SummonerRunes {
	private long summonerId;
	private Set<RunePage> pages;
	
	public long getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}
	public Set<RunePage> getPages() {
		return pages;
	}
	public void setPages(Set<RunePage> pages) {
		this.pages = pages;
	}
}
