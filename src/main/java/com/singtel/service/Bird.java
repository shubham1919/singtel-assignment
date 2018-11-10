package com.singtel.service;

import com.singtel.service.enums.MessageEnum;
import com.singtel.vo.AnimalProperties;
import com.singtel.vo.SingVo;

public class Bird extends Animal{

	public Bird() {
		this.canFly(MessageEnum.CAN_FLY.getValue());
		this.cannotSwim(MessageEnum.CANNOT_SWIM.getValue());
		this.canWalk(MessageEnum.CAN_WALK.getValue());
		this.cannotSing(MessageEnum.CANNOT_SING.getValue());
	}
}
