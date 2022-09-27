package com.que3;

abstract public class Evaluation {

	private final int numberOfQuestions;

	abstract void evaluationTiming();

	void printNoOfQuestions() {
		System.out.println("No. of Questions in Evaluation is :" + numberOfQuestions);
	}

	public int getNumberOfQuestions() {
		return numberOfQuestions;
	}

	public Evaluation(int numberOfQuestions) {
		this.numberOfQuestions = numberOfQuestions;
	}

}
