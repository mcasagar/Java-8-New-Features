package com.sb.dateclassexamples;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateClassDemo {

	public static void main(String[] args) {
		//Getting current date
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		//Getting specific date using of method
		LocalDate date = LocalDate.of(2022, 05, 20);
		System.out.println(date);
		
		date = LocalDate.of(2021, Month.MAY, 20);
		System.out.println(date);
		
		//Converting String to date usign parse method
		date = LocalDate.parse("2015-02-26");
		System.out.println(date);
		
		//Adding 4 days to given date
		date = date.plusDays(4);
		System.out.println(date);
		
		//Adding 4 month to given date 
		date = date.plusMonths(4);
		System.out.println(date);
		
		//Check date is befor given date
		 boolean isBefor = LocalDate.parse("2022-03-21").isBefore(LocalDate.parse("2022-08-21"));
		 System.out.println(isBefor);
		 
		 //Check date is after given date
		 boolean isAfter = LocalDate.parse("2022-03-21").isAfter(LocalDate.parse("2022-08-21"));
		 System.out.println(isAfter);
	}

}
