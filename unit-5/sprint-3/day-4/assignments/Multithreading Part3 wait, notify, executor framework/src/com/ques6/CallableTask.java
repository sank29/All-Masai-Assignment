package com.ques6;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {
	private int num;

	CallableTask(int num) {
		this.num = num;
	}

	@Override
	public String call() throws Exception {

		if (this.num % 2 == 0) {
			return num + " Even Number";
		} else {
			return num + " Odd Number";
		}

	}

}
