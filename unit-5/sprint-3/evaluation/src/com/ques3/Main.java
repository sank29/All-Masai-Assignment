package com.ques3;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newFixedThreadPool(3);

		ArrayList<MyCallable> arr = new ArrayList<>();

		arr.add(new MyCallable(12));
		arr.add(new MyCallable(10));
		arr.add(new MyCallable(11));
		arr.add(new MyCallable(14));
		arr.add(new MyCallable(15));
		arr.add(new MyCallable(20));

		int result = 1;
		for (MyCallable eachCallable : arr) {

			Future<Integer> f = service.submit(eachCallable);
			result *= f.get();
			System.out.println(result);

		}

		service.shutdown();

	}

}
