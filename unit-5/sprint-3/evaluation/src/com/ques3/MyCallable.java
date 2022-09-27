package com.ques3;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

	private int num;
	private int result = 1;

	public MyCallable(int num) {
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		result *= num;
		return result;
	}

}
