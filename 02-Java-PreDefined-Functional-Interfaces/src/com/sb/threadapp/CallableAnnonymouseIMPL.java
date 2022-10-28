package com.sb.threadapp;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableAnnonymouseIMPL {

	public static void main(String[] args) {
		//old approach
		/*Callable callable = new Callable() {
			@Override
			public Object call() throws Exception {
				for(int i = 100; i<=110; i++) {
					System.out.println(i);
					try {
						Thread.sleep(300);
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				return null;
			}
		};*/
		
		//new Approach (using lambda)
		Callable callable = ()  -> {
			for(int i = 500; i<=510; i++) {
				System.out.println(i);
			}
			return null;
		};
		ExecutorService exService = Executors.newFixedThreadPool(1);
		exService.submit(callable);

	}

}
