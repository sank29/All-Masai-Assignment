package com.ques4;

public class DhoniThread implements Runnable {
	private int sumOfOneToTwenty;

	@Override
	public void run() {
		int result = 1;
		for (int i = 0; i <= 20; i++) {
			result += i;
		}

		sumOfOneToTwenty = result;
		System.out.println("Thread is " + Thread.currentThread().getName() + " " + sumOfOneToTwenty);

	}

}
