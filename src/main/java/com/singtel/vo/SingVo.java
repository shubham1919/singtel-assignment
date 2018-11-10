package com.singtel.vo;

public class SingVo {

	private boolean canSing;
	private String value;
	
	public SingVo(boolean canSing, String value) {
		this.canSing = canSing;
		this.value = value;
	}
	
	public boolean canSing() {
		return this.canSing;
	}
	
	public String value() {
		return this.value;
	}
}
