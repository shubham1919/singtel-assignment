package com.singtel.vo;

public class SwimVo {
	
	private boolean canSwim;
	private String value;
	
	public SwimVo(boolean canSwim, String value) {
		this.canSwim = canSwim;
		this.value = value;
	}
	
	public boolean canSwim() {
		return this.canSwim;
	}
	
	public String value() {
		return this.value;
	}
}
