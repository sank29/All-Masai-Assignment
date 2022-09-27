package com.que6;

public class CommerceStudent implements Student {
	private int accountMarks;
	private int economicsMarks;
	private int businessStudiesMarks;

	public CommerceStudent(int accountMarks, int economicsMarks, int businessStudiesMarks) {
		this.accountMarks = accountMarks;
		this.economicsMarks = economicsMarks;
		this.businessStudiesMarks = businessStudiesMarks;
	}

	public int getAccountMarks() {
		return accountMarks;
	}

	public void setAccountMarks(int accountMarks) {
		this.accountMarks = accountMarks;
	}

	public int getEconomicsMarks() {
		return economicsMarks;
	}

	public void setEconomicsMarks(int economicsMarks) {
		this.economicsMarks = economicsMarks;
	}

	public int getBusinessStudiesMarks() {
		return businessStudiesMarks;
	}

	public void setBusinessStudiesMarks(int businessStudiesMarks) {
		this.businessStudiesMarks = businessStudiesMarks;
	}

	@Override
	public double findPercentage() {
		int totalMars = this.accountMarks + this.businessStudiesMarks + this.economicsMarks;
		double percetage = (float) ((totalMars / 300) * 100);

		return percetage;
	}

}
