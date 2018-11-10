package com.singtel.service.impl;

import com.singtel.service.Bird;
import com.singtel.service.enums.BirdSoundEnum;
import com.singtel.service.enums.MessageEnum;

public class Chicken extends Bird{
	
	private String name;
	
	public Chicken() {
		this.name = "chicken";
		this.setProperties();
		this.setSingingForChicken();
	}
	
	public Chicken(String name) {
		this.name = name;
		this.setProperties();
		this.setSingingForChicken();
	}
	
	private void setSingingForChicken() {
		if(name.equalsIgnoreCase(BirdSoundEnum.ROOSTER.getBird())) {
			this.canSing(BirdSoundEnum.ROOSTER.getBirdSound());
		} else {
			this.canSing(BirdSoundEnum.CHICKEN.getBirdSound());
		}
	}
	
	private void setProperties() {
		this.cannotFly(MessageEnum.CANNOT_FLY.getValue());
	}
}
