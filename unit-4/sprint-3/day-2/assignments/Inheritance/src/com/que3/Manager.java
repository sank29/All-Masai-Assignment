package com.que3;

public class Manager extends Member {

	private String specialisation;
	private String department;

	public Manager(String name, int age, String phoneNumber, String address, double salary, String specialisation,
			String department) {
		super(name, age, phoneNumber, address, salary);
		this.specialisation = specialisation;
		this.department = department;
	}

	public String getSpecialisation() {
		return specialisation;
	}

	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
