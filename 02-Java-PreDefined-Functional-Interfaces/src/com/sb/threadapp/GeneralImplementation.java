package com.sb.threadapp;

public class GeneralImplementation implements Runnable {
	@Override
	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		GeneralImplementation gi = new GeneralImplementation();
		Thread th = new Thread(gi);
		th.start();

	}

}
