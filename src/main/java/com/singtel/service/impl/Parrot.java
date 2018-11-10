package com.singtel.service.impl;

import com.singtel.service.Bird;
import com.singtel.service.enums.BirdSoundEnum;
import com.singtel.service.enums.MessageEnum;

public class Parrot extends Bird{

	private String parrotName;
	
	public Parrot(String parrotName) {
		this.parrotName = parrotName;
		this.setSingingForParrot();
	}
	
	private void setSingingForParrot() {
		if(parrotName.equalsIgnoreCase(BirdSoundEnum.PARROT_LIVING_WITH_DOG.getBird())) {
			this.canSing(BirdSoundEnum.PARROT_LIVING_WITH_DOG.getBirdSound());
		}
		else if(parrotName.equalsIgnoreCase(BirdSoundEnum.PARROT_LIVING_WITH_CAT.getBird())) {
			this.canSing(BirdSoundEnum.PARROT_LIVING_WITH_CAT.getBirdSound());
		}
		else if(parrotName.equalsIgnoreCase(BirdSoundEnum.PARROT_LIVING_WITH_ROOSTER.getBird())){
			this.canSing(BirdSoundEnum.PARROT_LIVING_WITH_ROOSTER.getBirdSound());
		}
		else {
			this.canSing(MessageEnum.CAN_SING.getValue());
		}
	}
}
