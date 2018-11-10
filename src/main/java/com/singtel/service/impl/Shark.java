package com.singtel.service.impl;

import com.singtel.service.Fish;

public class Shark extends Fish{
	
	private String eatFish;
	
	public Shark() {
		this.setColor("grey");
		this.setSize("large");
		this.eatFish = "Eats other fish";
	}
	
	public String getEatFish() {
		return this.eatFish;
	}
}
