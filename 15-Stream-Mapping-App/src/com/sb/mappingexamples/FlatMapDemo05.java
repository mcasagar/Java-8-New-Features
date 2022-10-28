package com.sb.mappingexamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo05 {

	public static void main(String[] args) {
		List<String> javacourses = Arrays.asList("Core Java", "Adv Java", "SBMS","JRPT");
		List<String> uicourses = Arrays.asList("Html","CSS","JavaScript","Bootstrap");
		List<String> cloudcourses = Arrays.asList("AWS","Azure","DevOps","GC");
		
		List<List<String>> softwarecourses = Arrays.asList(javacourses,uicourses,cloudcourses);
		
		Stream<List<String>> stream = softwarecourses.stream();
		Stream<String> courses = stream.flatMap(sc -> sc.stream());
		courses.forEach(System.out::println);
		

	}

}
