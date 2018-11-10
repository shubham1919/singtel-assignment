package com.singtel.service.enums;

public enum BirdSoundEnum {
	
	CHICKEN("chicken", "Cluck, cluck"),
	ROOSTER("rooster", "Cock-a-doodle-doo"),
	DUCK("duck", "Quack, quack"),
	PARROT_LIVING_WITH_DOG("parrotWithDog", "Woof, woof"),
	PARROT_LIVING_WITH_CAT("parrotWithCat","Meow"),
	PARROT_LIVING_WITH_ROOSTER("parrotWithRooster","Cock-a-doodle-doo");
	
	private String bird;
	
	private String birdSound;
	
	BirdSoundEnum(String bird, String birdSound) {
		this.bird = bird;
		this.birdSound = birdSound;
	}
	
	public String getBird() {
		return this.bird;
	}
	
	public String getBirdSound() {
		return this.birdSound;
	}
}
