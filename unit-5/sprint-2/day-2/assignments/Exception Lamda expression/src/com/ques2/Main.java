package com.ques2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static List<Cities> cities = new ArrayList<>();

	public static void main(String[] args) {

		cities.add(new Cities("Mumbai"));
		cities.add(new Cities("Mumbai"));
		cities.add(new Cities("Nashik"));
		cities.add(new Cities("Buldhana"));
		cities.add(new Cities("Lonar"));

//		Collections.sort(cities, new Comparator<Cities>() {
//
//			@Override
//			public int compare(Cities o1, Cities o2) {
//				
//				return o2.getCityName().compareTo(o1.getCityName());
//			}
//
//		});

		Collections.sort(cities, (city1, city2) -> {
			System.out.println(city1.equals(city2));

			return city1.getCityName().compareTo(city2.getCityName());
		});

		for (Cities city : cities) {

			System.out.println(city);

		}

	}

}
