package com.ques3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {

		// created new library
		Library newLibrary = new Library();

		// created new books
		Book book1 = new Book(15, "c++", "By Sanket");
		newLibrary.addBookInLibrary(book1);

		Book book2 = new Book(16, "java", "By Ratan Sir");
		newLibrary.addBookInLibrary(book2);

		Book book3 = new Book(15, "c", "By akash");
		newLibrary.addBookInLibrary(book3);

		Book book4 = new Book(13, "go", "Rushi");
		newLibrary.addBookInLibrary(book4);

		Book book5 = new Book(14, "Nodejs", "Bachu");
		newLibrary.addBookInLibrary(book5);

		// create data and applying pattern
		String dob = "05/02/2015";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld = LocalDate.parse(dob, dtf);
		// creating new members
		Members members1 = new Members(12, "Sanket", 23, ld);
		newLibrary.addMembers(members1);

		// create data and applying pattern
		String dob1 = "05/02/2010";
		LocalDate ld1 = LocalDate.parse(dob1, dtf);
		// creating new members
		Members members2 = new Members(11, "Akash", 23, ld1);
		newLibrary.addMembers(members2);

		// create data and applying pattern
		String dob2 = "05/02/2018";
		LocalDate ld2 = LocalDate.parse(dob2, dtf);
		// creating new members
		Members members3 = new Members(12, "Bachu", 23, ld2);
		newLibrary.addMembers(members3);

		newLibrary.displayAllMenmbers();

	}

}
