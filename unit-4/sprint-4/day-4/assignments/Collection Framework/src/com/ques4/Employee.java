package com.ques4;

import java.util.Objects;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private Department department;

	public Employee(int employeeId, String employeeName, double employeeSalary, Department department) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.department = department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeName, employeeSalary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employeeId == other.employeeId && Objects.equals(employeeName, other.employeeName)
				&& Double.doubleToLongBits(employeeSalary) == Double.doubleToLongBits(other.employeeSalary);
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", departmentId=" + department.getDepartmentId() + ", departmentName="
				+ department.getDepartmentName() + "]";
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public Department getDepartment() {
		return department;
	}

}
