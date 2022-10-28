package com.sb.threadapp;

public class LambdaImpl {

	public static void main(String[] args) {
		
		Runnable runnable = () -> {
			for(int i = 31; i<=40; i++) {
				System.out.println(i);
			}
		};
		//runnable.run();
		Thread th = new Thread();
		th.start();

	}

}
