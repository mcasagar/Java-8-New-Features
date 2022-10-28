package com.sb.methodreference;

public class Test1 {

	public static void m2() {
		System.out.println("Hello Sagar");
	}
	
	public void m3() {
		System.out.println("Instance method");
	}
	
	public static void main(String[] args) {
		MyInterface mi = Test1::m2; //Static method reference
		mi.m1(); //abstract method calling 
		
		Test1 t = new Test1();
		 MyInterface mi1 = t::m3;  //Instance method reference
		 mi1.m1();

	}

}

@FunctionalInterface
interface MyInterface{
	public void m1();
}
