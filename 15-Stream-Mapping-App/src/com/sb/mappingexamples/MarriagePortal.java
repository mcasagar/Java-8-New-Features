package com.sb.mappingexamples;

import java.util.Arrays;
import java.util.List;

public class MarriagePortal {

	public static void main(String[] args) {
		Person p1 = new Person("Sagar", "Software", 7755999617l);
		Person p2 = new Person("Tushar","Testing", 7218181421l);
		Person p3 = new Person("Akash", "Dev", 8987445344l);
		Person p4 = new Person("Mayur","Cloud", 9980983744l);
		Person p5 = new Person ("Utkarsh", "Python", 7445849334l);
		
		//creating list of Person objects
		List<Person> persons = Arrays.asList(p1, p2,p3,p4,p5);
		
		//creating Stream 
		
		persons.stream().filter(person -> person.getJob().equals("Software"))
												.map(person -> person.getName() + " :: " + person.getPhno())
												.forEach(System.out::println);

	}

}
