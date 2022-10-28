package com.sb.mappingexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilteringMappingDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		// add names in list
		list.add("Sagar Bhoi");
		list.add("Mandar Kende");
		list.add("Utkarsh Khedkar");
		list.add("Pratik Chaure");
		list.add("Akash Ramgir");
		
		//creating stream object of list
		Stream<String> stream = list.stream();
		//print name with lenght whos name start with "A" 
		
		stream.filter(name -> name.startsWith("A"))
																		.map(name -> name +" :: "+  name.length())
																		.forEach(System.out::println);
	}
}
