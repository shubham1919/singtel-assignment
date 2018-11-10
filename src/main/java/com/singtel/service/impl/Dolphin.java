package com.singtel.service.impl;

import com.singtel.service.Animal;
import com.singtel.service.enums.MessageEnum;

public class Dolphin extends Animal{
	
	public Dolphin() {
		this.canSwim(MessageEnum.CAN_SWIM.getValue());
		this.cannotFly(MessageEnum.CANNOT_FLY.getValue());
		this.cannotSing(MessageEnum.CANNOT_SING.getValue());
		this.cannotWalk(MessageEnum.CANNOT_WALK.getValue());
	}
}
