package com.sb.filteringexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PersonsFilter {

	public static void main(String[] args) {
		//initializing person with 5 object values
		Person p1 = new Person("Sagar", 25, "Software");
		Person p2 = new Person("Tushar", 23, "Testing");
		Person p3 = new Person("Bala", 18, "Shopkeeper");
		Person p4 = new Person("Ramu", 45, "Business");
		Person p5 = new Person("Shamu", 35, "Painter");
		
		// adding those object data in one list collection
		List<Person> list = Arrays.asList(p1,p2,p3,p4,p5);
		
		//creating Stream
		Stream<Person> stream = list.stream();
		
		//perform operation on stream
		//print those peaple object data, who are age abouve 18 and job in Software
		stream.filter(i -> i.getAge() > 18 && i.getJob() == "Software").forEach(System.out::println);

	}

}
