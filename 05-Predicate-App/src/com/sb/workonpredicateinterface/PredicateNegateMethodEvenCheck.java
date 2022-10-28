package com.sb.workonpredicateinterface;

import java.util.function.Predicate;

public class PredicateNegateMethodEvenCheck {

	public static void main(String[] args) {
		Predicate<Integer> predicate = (i) -> i%2 == 0;
		boolean status = isEven(predicate,10);
		System.out.println(status); 
	}
	
	public static boolean isEven(Predicate<Integer> predicate, Integer i) {
		return predicate.negate().test(i); //negate method returns 
	}

}
