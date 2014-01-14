package lolLib.objects;

import java.util.List;

public class League {
	
	private List<LeagueSummoner> entries;
	private String name;
	private String queue;
	private String tier;
	
	public League() {
		
	}
	
	public List<LeagueSummoner> getEntries() {
		return entries;
	}
	public void setEntries(List<LeagueSummoner> entries) {
		this.entries = entries;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQueue() {
		return queue;
	}
	public void setQueue(String queue) {
		this.queue = queue;
	}
	public String getTier() {
		return tier;
	}
	public void setTier(String tier) {
		this.tier = tier;
	}
}
