package com.singtel.service;

import com.singtel.service.enums.MessageEnum;

public class Fish extends Animal{
	
	private String color;
	private String size;
	
	public Fish() {
		this.cannotFly(MessageEnum.CANNOT_FLY.getValue());
		this.cannotSing(MessageEnum.CANNOT_SING.getValue());
		this.cannotWalk(MessageEnum.CANNOT_WALK.getValue());
		this.canSwim(MessageEnum.CAN_SWIM.getValue());
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getSize() {
		return this.size;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
}
