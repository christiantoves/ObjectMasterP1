package com.chris.objectmasterp1;

public class Human {
	private int strength = 3;
	private int intelligence = 3;
	private int stealth = 3;
	private int health = 100;
	
	public void showHealth() {
		System.out.println(this.health);
	}
	
	public void attack(Human target) {
		target.health-=this.strength;
	}
}
