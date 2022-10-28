package com.sb.matchmethodexamples;

import java.util.ArrayList;
import java.util.List;

public class AnyMatchMethodDemo {

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<>();
		
		list.add(new Person("Sagar",25,"India"));
		list.add(new Person("Tushar",23,"USA"));
		list.add(new Person("Joy",50,"Canada"));
		list.add(new Person("Rohan",45,"India"));
		list.add(new Person("Ching",56,"China"));
		
		boolean isIndianAvailable = list.stream().anyMatch(name -> name.getCountry().equals("India"));
		
		System.out.println("Is Indian available in collection :: "+isIndianAvailable);
	}

}
