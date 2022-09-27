package com.ques3;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		List<Integer> allNums = Arrays.asList(1, 5, 10, 23, 43);

		Map<Integer, Integer> allMapNums = new LinkedHashMap<>();

		allNums.forEach(nums -> allMapNums.put(nums, nums * nums));

		allMapNums.forEach((key, value) -> System.out.println("Integer is " + key + " and it's square is " + value));

	}

}
