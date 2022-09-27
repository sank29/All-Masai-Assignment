package com.ques3;

public class Main {

	public static void main(String[] args) {

		MyRunnable evenPrintingJob = new MyRunnable();
		MyRunnable1 oddPrintingJob = new MyRunnable1();

		Thread myThread1 = new Thread(evenPrintingJob);
		Thread myThread2 = new Thread(oddPrintingJob);

		myThread1.start();

		try {

			myThread1.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		myThread2.start();

	}

}
