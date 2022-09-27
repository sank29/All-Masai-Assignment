package com.ques3;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Library {

	public static Scanner sc = new Scanner(System.in);

	private static LinkedHashSet<Book> book = new LinkedHashSet<>();

	private static TreeSet<Members> members = new TreeSet<>(new MembersComp());

	public void addMembers(Members newMembers) {
//		members.add(newMembers);
		int flag = 0;

		if (members.size() == 0) {
			System.out.println("Member added !!!");
			members.add(newMembers);
		} else if (members.size() != 0) {
			for (Members eachMembers : members) {
				flag = 0;
				if (eachMembers.equals(newMembers)) {
					System.out.println("This member id or membership number is register before");
				} else {
					flag = 1;
				}
			}
			if (flag == 1) {
				System.out.println("Member added !!!");
				members.add(newMembers);
			}
		}

//
//		if (members.contains(newMembers)) {
//			System.out.println("This member id or membership number is register before");
//		} else {
//			members.add(newMembers);
//			System.out.println("Member added !!!");
//		}

//		if (!members.add(newMembers)) {
//			System.out.println("This member id or membership number is register before");
//		} else {
//			System.out.println("Member added !!!");
//		}

	}

	public void displayAllMenmbers() {
//		Collections.sort(members, new MembersComp());

		for (Members eachMembers : members) {
			System.out.println("Member id is " + eachMembers.getMemberId());
			System.out.println("Member member name is " + eachMembers.getMemberName());
			System.out.println("Membership number is " + eachMembers.getMembershipNo());
			System.out.println("Membership end data is " + eachMembers.getMembershipEnddate());
		}

	}

	public void addBookInLibrary(Book newBook) {

		// Adding book by users

//		System.out.println("How many books you want to add in one go ?");
//		int howManyBooks = sc.nextInt();

//		for (int i = 0; i <= howManyBooks - 1; i++) {
//			System.out.println("Please enter book name");
//			sc.nextLine();
//			String bookName = sc.nextLine();
//
//			System.out.println("Please enter book author");
//			String bookAuthor = sc.nextLine();
//
//			System.out.println("Please enter book id");
//			int bookId = sc.nextInt();
//
//			Book newBook = new Book(bookId, bookName, bookAuthor);
//			if(!book.add(newBook)) {
//				System.out.println("This book id is already present in data base. Please try again");
//			}else {
//				System.out.println("Book added successfully. Thank You!!!");
//			}
//
//		}

		if (!book.add(newBook)) {
			System.out.println("This book id :" + " " + newBook.getBookId() + " and book name: " + newBook.getBookName()
					+ " is already present in data base. Please try again");
		} else {
			System.out.println("Book " + newBook.getBookName() + " added successfully. Thank You!!!");
		}

	}

}
