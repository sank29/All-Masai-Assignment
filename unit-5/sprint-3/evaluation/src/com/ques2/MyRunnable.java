package com.ques2;

public class MyRunnable implements Runnable {
	private int result = 1;

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			result *= i;
		}

		try {
			notify();
		} catch (Exception e) {

		}
	}

	public int getResult() {
		return result;
	}

}
