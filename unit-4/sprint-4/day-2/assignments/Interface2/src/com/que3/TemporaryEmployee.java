package com.que3;

public class TemporaryEmployee extends Employee {
	private int hoursWorked;
	private int hourlyWages;

	public TemporaryEmployee(int employeeId, String employeeName, int hourlyWorked, int hourlyWages) {
		super(employeeId, employeeName);
		this.hoursWorked = hourlyWorked;
		this.hourlyWages = hourlyWages;
		calculateSalary();
	}

	@Override
	void calculateSalary() {
		double calSalary = this.hoursWorked * this.hourlyWages;

		this.setSalary(calSalary);
	}

}
