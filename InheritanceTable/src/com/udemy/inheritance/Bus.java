package com.udemy.inheritance;

import javax.persistence.Entity;

@Entity
public class Bus extends Vehicle {

	private int numberOfPassangers;

	public Bus() {

	}

	public Bus(String name, int numberOfPassangers) {
		super(name);
		this.numberOfPassangers = numberOfPassangers;
	}

	public int getNumberOfPassangers() {
		return numberOfPassangers;
	}

	public void setNumberOfPassangers(int numberOfPassangers) {
		this.numberOfPassangers = numberOfPassangers;
	}
}
