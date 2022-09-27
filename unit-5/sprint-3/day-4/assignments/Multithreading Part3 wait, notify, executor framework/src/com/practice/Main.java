package com.practice;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
	public static void main(String[] args) {

		ThreadPoolExecutor myThread = new ScheduledThreadPoolExecutor(2);

		myThread.execute(new MyRunnable(myThread));

		myThread.execute(new MyRunnable(myThread));

		myThread.shutdown();
	}
}
