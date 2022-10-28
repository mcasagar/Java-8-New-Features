package com.sb.beans;

import java.util.ArrayList;
import java.util.List;

public class DistinctMethod {

	public static void main(String[] args) {
		List<String> countries = new ArrayList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("UK");
		countries.add("China");
		countries.add("India");
		countries.add("USA");
		
		countries.stream()
						.distinct() //returns unique objects
						.forEach(System.out::println);
		
		

	}

}
