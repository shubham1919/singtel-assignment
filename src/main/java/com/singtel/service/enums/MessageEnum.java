package com.singtel.service.enums;

public enum MessageEnum {
	
	CAN_FLY("Can Fly"),
	CANNOT_FLY("Cannot Fly"),
	CAN_SWIM("Can Swim"),
	CANNOT_SWIM("Cannot Swim"),
	CAN_WALK("Can Walk"),
	CANNOT_WALK("Cannot Walk"),
	CAN_SING("Can Sing"),
	CANNOT_SING("Cannot Sing"),;
	
	private String value;
	
	MessageEnum(String value) {
		this.value =value;
	}
	
	public String getValue() {
		return value;
	}
}
