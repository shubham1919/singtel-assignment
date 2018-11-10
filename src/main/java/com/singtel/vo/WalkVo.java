package com.singtel.vo;

public class WalkVo {
	
	private boolean canWalk;
	private String value;
	
	public WalkVo(boolean canWalk, String value) {
		this.canWalk = canWalk;
		this.value = value;
	}
	
	public boolean canWalk() {
		return this.canWalk;
	}
	
	public String value() {
		return this.value;
	}
}	
