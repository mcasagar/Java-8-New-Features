package com.sb.dateclassexamples;

import java.time.LocalDate;
import java.time.Period;

public class PeriodClassDemo {

	public static void main(String[] args) {
		Period period = Period.ofDays(5);
		System.out.println(period.getDays());
		
		period = Period.ofMonths(3);
		System.out.println(period.getMonths());
		
		period = period.ofYears(2);
		System.out.println(period.getYears());
		
		//find difference between two dates
		Period p = Period.between(LocalDate.parse("1997-06-24"), LocalDate.now());
		System.out.println(p);

	}

}
