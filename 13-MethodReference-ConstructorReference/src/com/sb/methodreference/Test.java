package com.sb.methodreference;

import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {
		Consumer<String> consumer = System.out::println;
		consumer.accept("Sagar");
		
		

	}

}
