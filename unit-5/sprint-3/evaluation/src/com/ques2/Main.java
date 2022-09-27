package com.ques2;

public class Main {

	public static void main(String[] args) {

		MyRunnable myTask = new MyRunnable();

		Thread myThread = new Thread(myTask);

		myThread.start();

		try {
			myThread.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		System.out.println("Product is " + myTask.getResult());

	}

}
