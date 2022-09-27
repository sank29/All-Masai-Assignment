package com.que2;

import java.util.Comparator;

public class EmployeeSalaryComp implements Comparator<Employee> {

	@Override
	public int compare(Employee employee1, Employee employee2) {

		if (employee1.getSalary() > employee2.getSalary())
			return +1;
		else if (employee1.getSalary() < employee2.getSalary())
			return -1;
		else
			return 0;

	}

}
