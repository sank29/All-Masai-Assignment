package com.que6;

public class ArtStudent implements Student {
	private int hindiMarks;
	private int englisMarks;
	private int historyMarks;

	public ArtStudent(int hindiMarks, int englisMarks, int historyMarks) {
		super();
		this.hindiMarks = hindiMarks;
		this.englisMarks = englisMarks;
		this.historyMarks = historyMarks;
	}

	public int getHindiMarks() {
		return hindiMarks;
	}

	public void setHindiMarks(int hindiMarks) {
		this.hindiMarks = hindiMarks;
	}

	public int getEnglisMarks() {
		return englisMarks;
	}

	public void setEnglisMarks(int englisMarks) {
		this.englisMarks = englisMarks;
	}

	public int getHistoryMarks() {
		return historyMarks;
	}

	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}

	@Override
	public double findPercentage() {
		int totalMars = this.englisMarks + this.hindiMarks + this.historyMarks;

		double percetage = (float) ((totalMars / 300) * 100);
		return percetage;
	}

}
