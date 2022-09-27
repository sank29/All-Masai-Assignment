package com.ques1;

public class Main {

	public static void main(String[] args) {

		RunnableImp myRunnableImp = new RunnableImp();
		Thread myThread = new Thread(myRunnableImp);

		myThread.start();

		synchronized (myThread) {

			try {
				System.out.println(myThread.isAlive());
				System.out.println("Main thread going to sleep");
				myThread.wait();
				System.out.println("Main thread is awake");
				System.out.println(myThread.isAlive());
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

		System.out.println(myRunnableImp.getProduct());

	}
}
