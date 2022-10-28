package com.sb.findingmethodexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class FindFirstMethod {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		
		list.add(new Person("Sagar",25,"India"));
		list.add(new Person("Tushar",23,"USA"));
		list.add(new Person("Joy",50,"Canada"));
		list.add(new Person("Rohan",45,"India"));
		list.add(new Person("Ching",56,"China"));

		//find first method returns first object data of list if data available
		Optional<Person> findFirst = list.stream().filter(p -> p.getCountry().equals("India")).findFirst();
		
		if(findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}
	}

}
