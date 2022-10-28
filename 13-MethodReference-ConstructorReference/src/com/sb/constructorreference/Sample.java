package com.sb.constructorreference;

public class Sample {
	public static void main(String[] args) {
		SampleInterface si = () -> new Sample(); // using lambdas get method returning Sample object
		System.out.println(si.hashCode());
		
		SampleInterface si1 =  Sample::new; // using Constructor reference   
		System.out.println(si1.hashCode()); 
	}
}

@FunctionalInterface
interface SampleInterface{
	Sample get();
}