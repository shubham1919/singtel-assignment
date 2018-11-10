package com.singtel.vo;

public class AnimalProperties {
	
	private WalkVo walkVo;
	private FlyVo flyVo;
	private SwimVo swimVo;
	private SingVo singVo;
	
	public void setWalkable(boolean canWalk, String value) {
		walkVo = new WalkVo(canWalk, value);
	}
	
	public WalkVo getWalkable() {
		return this.walkVo;
	}
	
	public void setFlying(boolean canFly, String value) {
		flyVo = new FlyVo(canFly, value);
	}
	
	public FlyVo getFlying() {
		return this.flyVo;
	}
	
	public void setSwimming(boolean canSwim, String value) {
		swimVo = new SwimVo(canSwim, value);
	}
	
	public SwimVo getSwimming() {
		return this.swimVo;
	}
	
	public void setSinging(boolean canSing, String value) {
		singVo = new SingVo(canSing, value);
	}
	
	public SingVo getSinging() {
		return this.singVo;
	}
}
