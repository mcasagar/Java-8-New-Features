package com.sb.workonpredicateinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateJoinApp {

	public static void main(String[] args) {
		
		Person p1 = new Person("Raju",21);
		Person p2 = new Person("Chetan",67);
		Person p3 = new Person("Anil",16);
		Person p4 = new Person("Gita",24);
		Person p5 = new Person("Suchita",26);
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5);
		
		Predicate<Person> ageLowerLimit = (person) -> person.getAge() > 18;
		Predicate<Person> ageUpperLimit = (person) ->person.getAge() <65;
		
		for(Person p : persons) {
			Predicate<Person> predicate = ageLowerLimit.and(ageUpperLimit);
			boolean isEligible = predicate.test(p);
			if(isEligible) {
				System.out.println(p.getName());
			}
			
		}
		
	}

}
