package com.sb.beans;

public class Creata implements Vehicle {

	public Creata() {
		System.out.println("Creata :: 0-param constructor");
	}
	
	@Override
	public void cleanVehicle() {
		System.out.println("Vehicle getting cleaned");
	}

}
