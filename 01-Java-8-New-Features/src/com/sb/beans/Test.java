package com.sb.beans;

public class Test {
	/*	public static void wish(Greeting greeting) {
			greeting.greet();
		} #1
	*/
	public static void main(String[] args) {
		//apprach 1: by creating seprate classes for seprate perticulal languages and creating (not reccomonded)
		/*Greeting greeting = new EnglishGreeting();
		greeting.greet();
		
		greeting = new HindiGreeting();
		greeting.greet();*/
		
		//approach 2: by using Annonymous class (not recommended)
		/*wish(new Greeting() {
			@Override
			public void greet() {	
				System.out.println("Hello");
			}
		});
		
		wish(new Greeting() {
			@Override
			public void greet() {
				System.out.println("Namaskar");
			}
		});*/
		
		//Approach 3 real-time approach : (using lambda expression recommended)
//		wish(()->System.out.println("Hello"));       // #1 : its needed wish() static method
		
		//below is the best
												// abstract method implementations
		Greeting english = () -> System.out.println("Hello");
		Greeting hindi = () -> System.out.println("Namaskar");
		
		//abstract method calling
		english.greet();
		hindi.greet();
		
		

	}

}
