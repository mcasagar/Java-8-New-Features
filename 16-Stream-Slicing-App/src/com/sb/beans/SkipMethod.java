package com.sb.beans;

import java.util.ArrayList;
import java.util.List;

public class SkipMethod {

	public static void main(String[] args) {
		List<String> countries = new ArrayList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("UK");
		countries.add("China");
		countries.add("India");
		countries.add("USA");
		
		countries.stream()
						.skip(3) //skips first 3 object data and returns remaining object data
						.forEach(System.out::println);

	}

}
