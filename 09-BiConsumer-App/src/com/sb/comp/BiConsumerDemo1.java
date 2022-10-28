package com.sb.comp;

import java.util.function.BiConsumer;

public class BiConsumerDemo1 {

	public static void main(String[] args) {
		
		BiConsumer<String, String> bic = (name, addrs) -> {
			System.out.println("Hi i'm " + name);
			System.out.println("I'm From " +addrs);
		};
		bic.accept("Sagar", "Pune");

	}

}
