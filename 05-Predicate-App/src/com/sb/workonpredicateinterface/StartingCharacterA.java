package com.sb.workonpredicateinterface;

import java.util.function.Predicate;

public class StartingCharacterA {

	public static void main(String[] args) {
		String[] names = {"Anuska","Kajal","Samantha","Trisha","Anupama","Nayanthara","Aishwarya"};

		//my own logic
		/*Predicate<String> predicate = (name) -> name.charAt(0)=='A';
		
		for(int i=0; i<names.length; i++) {
			if(predicate.test(names[i])==true) {
				System.out.println(names[i]);
			}
		}*/
		
		Predicate<String> predicate = (name) -> name.startsWith("A");
		
		for(String name : names) {
			if(predicate.test(name)) {
				System.out.println(name);
			}
		}

	}

}
