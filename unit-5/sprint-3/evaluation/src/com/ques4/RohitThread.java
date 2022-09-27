package com.ques4;

public class RohitThread implements Runnable {
	private int productOfOneToTwenty;

	@Override
	public void run() {
		int result = 1;

		for (int i = 1; i <= 10; i++) {
			result *= i;
		}

		productOfOneToTwenty = result;
		System.out.println("Thread is " + Thread.currentThread().getName() + " " + productOfOneToTwenty);
	}

}
