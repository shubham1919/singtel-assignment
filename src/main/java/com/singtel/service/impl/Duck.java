package com.singtel.service.impl;

import com.singtel.service.Bird;
import com.singtel.service.enums.BirdSoundEnum;
import com.singtel.service.enums.MessageEnum;

public class Duck extends Bird{
	
	public Duck() {
		this.canSwim(MessageEnum.CAN_SWIM.getValue());
		this.cannotFly(MessageEnum.CANNOT_FLY.getValue());
		this.canSing(BirdSoundEnum.DUCK.getBirdSound());
	}
}
