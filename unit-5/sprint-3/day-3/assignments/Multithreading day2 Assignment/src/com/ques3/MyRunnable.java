package com.ques3;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println("Even number is " + i);
			}
		}
	}

}
