package com.practice;

import java.util.concurrent.ThreadPoolExecutor;

public class MyRunnable implements Runnable {
	ThreadPoolExecutor tr;

	MyRunnable(ThreadPoolExecutor tr) {
		this.tr = tr;
	}

	@Override
	public void run() {

		synchronized (tr) {
			for (int i = 0; i <= 100; i++) {

				if (i == 20) {
					try {
						System.out.println(tr.hashCode());
						tr.wait();
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}

				System.out.println(i + Thread.currentThread().getName());

			}

		}

	}
}
