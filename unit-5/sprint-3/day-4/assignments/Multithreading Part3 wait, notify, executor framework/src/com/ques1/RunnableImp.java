package com.ques1;

public class RunnableImp implements Runnable {

	private int product = 1;

	@Override
	public synchronized void run() {

		for (int i = 1; i <= 10; i++) {
			this.product *= i;
		}

		System.out.println("myThread is going to notify the main thread");
		notifyAll();

		System.out.println("myThread is dead");

	}

	public int getProduct() {

		return product;

	}

}
