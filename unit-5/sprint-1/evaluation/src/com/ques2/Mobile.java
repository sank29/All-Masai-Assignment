package com.ques2;

import java.util.ArrayList;
import java.util.HashMap;

public class Mobile {
	public static HashMap<String, ArrayList<String>> mobiles = new HashMap<>();

	public String addMobile(String company, String model) {

		mobiles.put(company, new ArrayList<>());

		ArrayList<String> modelArr = mobiles.get(model);
		modelArr.add(model);

		mobiles.put(model, modelArr);

		return "added!!!";

	}

}
