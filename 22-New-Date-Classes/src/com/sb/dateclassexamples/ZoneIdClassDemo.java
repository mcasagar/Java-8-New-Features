package com.sb.dateclassexamples;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneIdClassDemo {

	public static void main(String[] args) {
		ZoneId of = ZoneId.of("America/Marigot");
		System.out.println("Zone ID  ::  "+of);
		
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		System.out.println();
		//Fetching all zone ID's 
		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		for(String zoneid : availableZoneIds) {
			System.out.println(zoneid);
			
		}
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println();
		
		ZonedDateTime now = ZonedDateTime.now();
		System.out.println(now);
		
		System.out.println("Year :: "+ now.getYear());
		System.out.println("Month :: "+now.getMonthValue());
		System.out.println("Day :: "+now.getDayOfMonth());
	}

}
