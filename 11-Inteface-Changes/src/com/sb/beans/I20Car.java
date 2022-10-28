package com.sb.beans;

public class I20Car implements Vehicle {
	
	public I20Car() {
		System.out.println("I20Car :: 0-param constructor");
	}
	
	@Override
	public void cleanVehicle() {
		System.out.println("Car is getting cleaned");

	}
	
	@Override
	public void sensor() {
		System.out.println("Overriden sensor() method");
	}
	

}
