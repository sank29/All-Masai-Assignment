package com.que3;

public class Loan {

	private Loan() {

	}

	public double calculateLoanAmount(Employee employeeObj) {

		if (employeeObj instanceof PermanentEmployee) {

			double loan = (employeeObj.getSalary() * 15) / 100;
			return loan;

		} else if (employeeObj instanceof TemporaryEmployee) {
			double loan = (employeeObj.getSalary() * 10) / 100;
			return loan;

		} else {
			System.out.println("Please provide Permanent Employee or Temporary Employee");
			return -1;

		}
	}

	public static Loan createLoan() {
		return new Loan();
	}
}
