package com.sb.dateclassexamples;

import java.time.Duration;
import java.time.LocalTime;

public class DurationClassDemo {

	public static void main(String[] args) {
		Duration between = Duration.between(LocalTime.parse("12:14"), LocalTime.parse("15:15"));
		System.out.println(between);

	}

}
