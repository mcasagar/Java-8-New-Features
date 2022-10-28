package com.sb.dateclassexamples;

import java.time.LocalTime;

public class LocalTimeClassDemo {

	public static void main(String[] args) {
		//Getting Current time
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		//Gettiing Specific time using of method
		time = LocalTime.of(11, 20,04);
		System.out.println(time);
		
		//Convert String value to Time using parse method
		time = LocalTime.parse("12:30:11");
		System.out.println(time);
		
		//Adding 4 secconds to given time
		time = time.plusSeconds(4);
		System.out.println(time);
		
		//Adding 10 min to given time
		time = time.plusMinutes(10);
		System.out.println(time);
		
		//Adding 2 hours to given time 
		time = time.plusHours(2);
		System.out.println(time);

	}

}
