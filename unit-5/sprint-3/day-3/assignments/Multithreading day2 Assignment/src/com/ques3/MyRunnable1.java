package com.ques3;

public class MyRunnable1 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.println("Odd number is " + i);
			}
		}
	}
}
