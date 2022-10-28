package com.sb.beans;

public class TataVista implements Vehicle{
	
	public TataVista() {
		System.out.println("TataVista :: 0-param constructor");
	}
	
	@Override
	public void cleanVehicle() {
		System.out.println("Vehicle getting cleaned");
	}
}
