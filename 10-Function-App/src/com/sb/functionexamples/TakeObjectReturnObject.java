package com.sb.functionexamples;

import java.util.function.BiFunction;
import java.util.function.Function;

public class TakeObjectReturnObject {

	public static void main(String[] args) {
		
		Function<String, String> f1 = (s) -> s.toUpperCase();
		System.out.println(f1.apply("sagar"));
		
		Function<Integer, Integer> f2 = (i) -> (i * i);
		System.out.println(f2.apply(10));
		
		BiFunction<Integer, Integer, Integer> bic = (i, j) -> (i+j);
		System.out.println(bic.apply(10, 10));
		

	}

}
