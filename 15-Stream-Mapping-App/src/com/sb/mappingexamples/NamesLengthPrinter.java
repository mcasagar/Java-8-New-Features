package com.sb.mappingexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NamesLengthPrinter {

	public static void main(String[] args) {
		//creating persons name list 
				List<String> list = new ArrayList<>();
				
				// add names in list
				list.add("Sagar Bhoi");
				list.add("Mandar Kende");
				list.add("Utkarsh Khedkar");
				list.add("Pratik Chaure");
				list.add("Akash Ramgir");
				
				//creating stream object of list
				Stream<String> stream = list.stream();
				
				//stream.map(name -> name.toUpperCase() + " : : " + name.length()).forEach(System.out::println);
				
				//take input and give int as return output
				IntStream tfStream = stream.mapToInt(name -> name.length());
				
				tfStream.forEach(System.out::println);

	}

}
