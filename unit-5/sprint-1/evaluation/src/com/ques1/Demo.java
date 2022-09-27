package com.ques1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo {
	public static Map<Employee, String> sortMapUsingEmployeeSalary(Map<Employee, String> originalMap) {

		TreeMap<Employee, String> myTreeMap = new TreeMap<>(new employeeComp());

		myTreeMap.putAll(myTreeMap);

		for (Map.Entry<Employee, String> eachEmp : originalMap.entrySet()) {
			myTreeMap.put(eachEmp.getKey(), eachEmp.getValue());
		}

		return myTreeMap;

	}

	public static void main(String[] args) {

		HashMap<Employee, String> myHashMap = new HashMap<>();
		myHashMap.put(new Employee(12, "Sanket", 12000.00), "MH");
		myHashMap.put(new Employee(13, "Akash", 122000.00), "MP");
		myHashMap.put(new Employee(14, "Bachu", 1200.00), "CG");
		myHashMap.put(new Employee(15, "Rushi", 1200000.00), "Goa");

		Map<Employee, String> mySortedData = sortMapUsingEmployeeSalary(myHashMap);

		for (Map.Entry<Employee, String> eachEmp : mySortedData.entrySet()) {
			System.out.println(eachEmp);
		}

	}
}
