package com.sb.approach;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApproachOne {

	public static void main(String[] args) {
		
		Person p1 = new Person(101, "Sagar", "sagarbhoi97@gmail.com");
		Person p2 = new Person(102, "Rucha", "ruchasangale34@gmail.com");
		Person p3 = new Person(103, "Utkarsh","utkarsh@gmail.com");
		Person p4 = new Person(104, "Samiksha","samiksha@gmail.com");
		
		List<Person> person = Arrays.asList(p1,p2,p3,p4);
		
		System.out.println("==========Befor Sorting Object ==========");
		for(Person p : person) {
			System.out.println(p);
		}
		System.out.println();
		
		System.out.println("==========After Sorting Object==========");
		Collections.sort(person, new PersonComparator());
		for(Person p : person) {
			System.out.println(p);
		}

	}

}

class PersonComparator implements Comparator<Person>{
	@Override
	public int compare(Person p1, Person p2) {
		return p1.getPname().compareTo(p2.getPname());
	}
}
