package com.que3;

import java.util.Comparator;

public class MarksComp implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		int totalMarksOfStudent1 = student1.getEngMarks() + student1.getMathMarks() + student1.getScienceMarks();
		int totalMarksOfStudent2 = student2.getEngMarks() + student2.getMathMarks() + student2.getScienceMarks();

		if (totalMarksOfStudent1 < totalMarksOfStudent2) {
			return +1;
		} else if (totalMarksOfStudent1 > totalMarksOfStudent2) {
			return -1;
		} else {
			return student1.getName().compareTo(student2.getName());
		}
	}

}
