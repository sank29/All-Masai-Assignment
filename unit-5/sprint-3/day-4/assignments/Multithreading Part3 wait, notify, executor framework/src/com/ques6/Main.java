package com.ques6;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {

	public static void main(String[] args) {

		CallableTask[] allMyTasks = { new CallableTask(10), new CallableTask(13), new CallableTask(15),
				new CallableTask(20), new CallableTask(30), new CallableTask(14), new CallableTask(15),
				new CallableTask(16), };

		ThreadPoolExecutor myPoolExecutor = new ScheduledThreadPoolExecutor(3);

		for (CallableTask eachTasks : allMyTasks) {
			Future<String> f = myPoolExecutor.submit(eachTasks);

			try {

				System.out.println(f.get());

			} catch (InterruptedException | ExecutionException e) {

				e.printStackTrace();
			}
		}

		myPoolExecutor.shutdown();

	}

}
