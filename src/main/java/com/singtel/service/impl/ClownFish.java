package com.singtel.service.impl;

import com.singtel.service.Fish;

public class ClownFish extends Fish{
	
	private String makeJokes;
	public ClownFish() {
		this.setColor("orange");
		this.setSize("small");
		this.makeJokes = "makes Jokes";
	}
	
	public String getMakeJokes() {
		return this.makeJokes;
	}
}
