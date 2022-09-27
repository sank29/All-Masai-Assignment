package com.que6;

public class ScienceStudent implements Student {
	private int physicMarks;
	private int chemistryMarks;
	private int mathMarks;
	private int biologyMarks;

	public ScienceStudent(int physicMarks, int chemistryMarks, int mathMarks, int biologyMarks) {
		this.physicMarks = physicMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathMarks = mathMarks;
		this.biologyMarks = biologyMarks;
	}

	public int getPhysicMarks() {
		return physicMarks;
	}

	public void setPhysicMarks(int physicMarks) {
		this.physicMarks = physicMarks;
	}

	public int getChemistryMarks() {
		return chemistryMarks;
	}

	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}

	public int getMathMarks() {
		return mathMarks;
	}

	public void setMathMarks(int mathMarks) {
		this.mathMarks = mathMarks;
	}

	public int getBiologyMarks() {
		return biologyMarks;
	}

	public void setBiologyMarks(int biologyMarks) {
		this.biologyMarks = biologyMarks;
	}

	@Override
	public double findPercentage() {
		int totalMars = this.biologyMarks + this.chemistryMarks + this.mathMarks;

		double percetage = (float) ((totalMars / 400) * 100);
		return percetage;
	}

}
