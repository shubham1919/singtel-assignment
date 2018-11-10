package com.singtel.service;


import com.singtel.vo.AnimalProperties;

public abstract class Animal {
	
	private AnimalProperties animalProperties = new AnimalProperties();
	
	public void canWalk(String value) {
		animalProperties.setWalkable(true, value);
	}
	
	public void cannotWalk(String value) {
		animalProperties.setWalkable(false, value);
	}
	
	public void canFly(String value) {
		animalProperties.setFlying(true, value);
	}
	
	public void cannotFly(String value) {
		animalProperties.setFlying(false, value);
	}
	
	public void canSwim(String value) {
		animalProperties.setSwimming(true, value);
	}
	
	public void cannotSwim(String value) {
		animalProperties.setSwimming(false, value);
	}
	
	public void canSing(String value) {
		animalProperties.setSinging(true, value);
	}
	
	public void cannotSing(String value) {
		animalProperties.setSinging(false, value);
	}
	
	public String walk() {
		return animalProperties.getWalkable().value();
	}
	
	public boolean isWalk() {
		return animalProperties.getWalkable().canWalk();
	}	
	
	public String swim() {
		return animalProperties.getSwimming().value();
	}
	
	public boolean isSwim() {
		return animalProperties.getSwimming().canSwim();
	}
	
	public String fly() {
		return animalProperties.getFlying().value();
	}
	
	public boolean isFly() {
		return animalProperties.getFlying().canFly();
	}
	
	public String sing() {
		return animalProperties.getSinging().value();
	}
	
	public boolean isSing() {
		return animalProperties.getSinging().canSing();
	}
}
