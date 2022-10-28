package com.sb.supplierexaples;

import java.util.Date;
import java.util.function.Supplier;

public class ReturnDateApp {

	public static void main(String[] args) {
		
		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());

	}

}
