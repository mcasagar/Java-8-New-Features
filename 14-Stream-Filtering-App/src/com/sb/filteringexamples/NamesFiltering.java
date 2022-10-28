package com.sb.filteringexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NamesFiltering {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Sagar");
		list.add("Tushar");
		list.add("Mayur");
		list.add("Chetan");
		list.add("Rajendra");
		list.add("Akshay");
		list.add("Durga");
		
		//Printing names whose name start with "S" 
		Stream<String> stream = list.stream();
		stream.filter(i -> i.startsWith("S")).forEach(System.out::println);

	}

}
