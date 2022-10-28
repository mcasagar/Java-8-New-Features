package com.sb.beans;

import java.util.ArrayList;
import java.util.List;

public class LimitMethod {

	public static void main(String[] args) {
			List<String> countries = new ArrayList<>();
			countries.add("India");
			countries.add("USA");
			countries.add("UK");
			countries.add("China");
			countries.add("India");
			countries.add("USA");
			
			countries.stream()
							.limit(3) //returns first 3 object data
							.forEach(System.out::println);

	}

}
