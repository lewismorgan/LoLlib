package lolLib.objects.masteries;

import java.util.List;

public class MasteryPage {
	private boolean current;
	private long id;
	private String name;
	private List<Talents> talents;
	
	public boolean isCurrent() {
		return current;
	}
	public void setCurrent(boolean current) {
		this.current = current;
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
	public List<Talents> getTalents() {
		return talents;
	}
	public void setTalents(List<Talents> talents) {
		this.talents = talents;
	}
	
}
