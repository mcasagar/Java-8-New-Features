package com.sb.stringjoinerexamples;

import java.util.StringJoiner;

public class StringJoinerClassDemo {

	public static void main(String[] args) {
		//StringJoiner joiner = new StringJoiner(",");
		StringJoiner joiner = new StringJoiner(",","{","}");
		
		
		joiner.add("Ramu");
		joiner.add("Shita");
		joiner.add("Sagar");
		System.out.println(joiner);
	}

}
