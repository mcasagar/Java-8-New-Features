package com.sb.beans;

public class MyApp {

	public static void main(String[] args) {
		Vehicle vehicle = new Creata();
		vehicle.cleanVehicle();
		vehicle.sensor();
		Vehicle.fuelCheck();
		vehicle.startVehicle();

	}

}
