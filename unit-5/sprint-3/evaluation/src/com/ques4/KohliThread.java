package com.ques4;

public class KohliThread implements Runnable {
	private int sumOfOneToTen;

	@Override
	public void run() {
		int result = 0;

		for (int i = 0; i <= 10; i++) {
			result += i;
		}

		sumOfOneToTen = result;
		System.out.println("Thread is " + Thread.currentThread().getName() + " " + sumOfOneToTen);
	}

}
