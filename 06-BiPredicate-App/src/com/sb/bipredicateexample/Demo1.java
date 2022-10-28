package com.sb.bipredicateexample;

import java.util.function.BiPredicate;

public class Demo1 {

	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> biPredicate = (no1, no2) -> no1 + no2 > 100;
		System.out.println(biPredicate.test(10, 200));

	}

}
