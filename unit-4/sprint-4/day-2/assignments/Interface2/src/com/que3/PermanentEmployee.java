package com.que3;

public class PermanentEmployee extends Employee {

	private double basicPay;

	public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
		this.calculateSalary();
	}

	@Override
	void calculateSalary() {
		double calSalaray = this.basicPay - (this.basicPay * 0.12);
		this.setSalary(calSalaray);
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

}
