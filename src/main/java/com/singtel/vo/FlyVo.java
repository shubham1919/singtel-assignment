package com.singtel.vo;

public class FlyVo {

	private boolean canFly;
	private String value;
	
	public FlyVo(boolean canFly, String value) {
		this.canFly = canFly;
		this.value = value;
	}
	
	public boolean canFly() {
		return this.canFly;
	}
	
	public String value() {
		return this.value;
	}
}
