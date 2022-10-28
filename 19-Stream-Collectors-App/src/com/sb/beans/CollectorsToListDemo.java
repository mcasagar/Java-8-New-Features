package com.sb.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsToListDemo {
	
	public static void printNames(List<String> enpNames) {
		//some logic
		System.out.println(enpNames);
	}
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee("Sagar",25,30000));
		list.add(new Employee("Ashok",23,20000));
		list.add(new Employee("Suresh",33,25000));
		list.add(new Employee("Charan",26,40000));
		
		List<String> empNames = list.stream()
					.map(e -> e.getName())
					.collect(Collectors.toList()); // collecting data from stream and storing in another collection then use Collectors
				
		printNames(empNames);
		
	}
}
