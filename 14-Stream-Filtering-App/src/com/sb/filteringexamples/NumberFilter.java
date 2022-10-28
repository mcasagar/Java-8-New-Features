package com.sb.filteringexamples;

import java.util.stream.Stream;

public class NumberFilter {

	public static void main(String[] args) {
		/*Stream<Integer> stream = Stream.of(4,3,2,5,7,6,9,23,1);
		//print no using lambda
		stream.forEach(i -> System.out.println(i));
		//print no using method reference
		stream.forEach(System.out::println);*/
		
		Stream<Integer> stream1 = Stream.of(0,3,2,5,7,6,9,23,1);
		
		//filter method
		/*Stream<Integer> filterStream = stream1.filter(j -> j > 6);
		filterStream.forEach( j -> System.out.println(j));*/
		
		//filter using method reference with (method chaining) 
		stream1.filter(i -> i > 6 ).forEach(System.out::println);
		

	}

}
