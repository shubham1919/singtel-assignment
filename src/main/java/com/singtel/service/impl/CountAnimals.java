package com.singtel.service.impl;

import com.singtel.service.Animal;

public class CountAnimals {
	
	private Animal animal;
	private int count;
	
	public int numberOfAnimalsThatCanFly(Object[] objects) {
		count = 0;
		for(int i=0;i<objects.length;i++) {
			if(objects[i] instanceof Animal) {
				animal = (Animal)objects[i];
				count += animal.isFly() ? 1 : 0;
			}
		}
		return count;
	}
	
	public int numberOfAnimalsThatCanWalk(Object[] objects) {
		count = 0;
		for(int i=0;i<objects.length;i++) {
			if(objects[i] instanceof Animal) {
				animal = (Animal)objects[i];
				count += animal.isWalk() ? 1 : 0;
			}
		}
		return count;
	}
	
	public int numberOfAnimalsThatCanSing(Object[] objects) {
		count = 0;
		for(int i=0;i<objects.length;i++) {
			if(objects[i] instanceof Animal) {
				animal = (Animal)objects[i];
				count += animal.isSing() ? 1 : 0;
			}
		}
		return count;
	}
	
	public int numberOfAnimalsThatCanSwim(Object[] objects) {
		count = 0;
		for(int i=0;i<objects.length;i++) {
			if(objects[i] instanceof Animal) {
				animal = (Animal)objects[i];
				count += animal.isSwim() ? 1 : 0;
			}
		}
		return count;
	}
}
