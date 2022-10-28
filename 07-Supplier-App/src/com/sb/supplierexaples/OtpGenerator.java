package com.sb.supplierexaples;

import java.util.function.Supplier;

public class OtpGenerator {

	public static void main(String[] args) {
		
		Supplier<String> s = () -> {
			String otp = "";
			// for loop for execute 6 times, because we want to generate opt 6 digits
			for(int i = 1; i<= 6; i++) {
				//Math.random() methods return double value, so suppressing decimal no so we type casting here
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());

	}

}
