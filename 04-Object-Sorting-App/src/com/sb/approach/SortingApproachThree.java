package com.sb.approach;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApproachThree {

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
		
		Collections.sort(person, (o1,  o2) ->  o1.getPname().compareTo(o2.getPname()));
		System.out.println("===========After Sorting Obeject==========");
		for(Person p : person) {
			System.out.println(p);
		}

	}

}
