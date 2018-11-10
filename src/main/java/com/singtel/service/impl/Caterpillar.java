package com.singtel.service.impl;

import com.singtel.service.Animal;
import com.singtel.service.enums.MessageEnum;

public class Caterpillar extends Animal{
	
	public Caterpillar() {
		this.cannotSwim(MessageEnum.CANNOT_SWIM.getValue());
		this.cannotFly(MessageEnum.CANNOT_FLY.getValue());
		this.cannotSing(MessageEnum.CANNOT_SING.getValue());
		this.canWalk(MessageEnum.CAN_WALK.getValue());
	}
	
	public void changeToButerfly() {
		this.canFly(MessageEnum.CAN_FLY.getValue());
	}
}
