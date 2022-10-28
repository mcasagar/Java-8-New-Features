package com.sb.consumerexamples;

import java.util.function.Consumer;

public class WishMessageComsumerDemo {

	public static void main(String[] args) {
		
		Consumer<String> consumer = (name) -> System.out.println(name + " Good Morning!");
		consumer.accept("Sagar");
		
		Consumer<Integer> consumer2 = (i) -> System.out.println(i*i);
		consumer2.accept(20);
	}

}
