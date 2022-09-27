package com.que3;

public class Main {
	static void messageToStudents(Evaluation evaluation) {
		if (evaluation instanceof DsaEvaluation) {
			System.out.println("Its a DSA Evaluation");

		} else if (evaluation instanceof CodingEvaluation) {
			System.out.println("Its a Coding Evaluation");
		}

		System.out.println("No. of Questions in Evaluation is : " + evaluation.getNumberOfQuestions());
		evaluation.evaluationTiming();
	}

	public static void main(String[] args) {

		messageToStudents(new DsaEvaluation(5));
		messageToStudents(new CodingEvaluation(4));

	}

}
