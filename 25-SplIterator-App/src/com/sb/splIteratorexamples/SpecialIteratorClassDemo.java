package com.sb.splIteratorexamples;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SpecialIteratorClassDemo {

	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Pune","Hyd","Dhule","Mumbai");
		
		//old approach
		/*Iterator<String> iterator = cities.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		
		//New Approach
		//cities.spliterator().forEachRemaining(name -> System.out.println(name));
		cities.spliterator().forEachRemaining(System.out::println);
	}

}
