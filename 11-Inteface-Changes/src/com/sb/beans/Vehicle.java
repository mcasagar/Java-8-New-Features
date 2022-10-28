package com.sb.beans;

public interface Vehicle {
	void cleanVehicle();
	
	default void sensor() {
		System.out.println("SENSOR Added......");
	}
	
	default void startVehicle() {
		System.out.println("Vehicle Started...");
	}
	
	static void fuelCheck() {
		System.out.println("Checking fuel");
	}
}
