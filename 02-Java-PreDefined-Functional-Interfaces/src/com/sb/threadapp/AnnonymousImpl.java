package com.sb.threadapp;

public class AnnonymousImpl {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for(int i = 21; i<=30; i++) {
					System.out.println(i);
				}//for
				
			}//run
		};//annonymous class
		//runnable.run();
		Thread th = new Thread();
		th.start();
	}//main

}//class
