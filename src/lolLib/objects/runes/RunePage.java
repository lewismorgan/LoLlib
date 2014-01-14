package lolLib.objects.runes;

import java.util.List;

public class RunePage {
	private boolean current;
	private long id;
	private String name;
	private List<RuneSlot> slots;
	
	public RunePage() {
		
	}
	
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
	public List<RuneSlot> getSlots() {
		return slots;
	}
	public void setSlots(List<RuneSlot> slots) {
		this.slots = slots;
	}
}
