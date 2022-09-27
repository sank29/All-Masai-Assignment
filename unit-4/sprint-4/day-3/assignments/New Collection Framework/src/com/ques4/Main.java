package com.ques4;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		printMenu();
		userArea();

	}

	public static void userArea() {
		Library library = new Library();
		boolean quit = false;
		while (!quit) {
			System.out.println("Enter your choice :");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter the isbn no");
				int isbn = sc.nextInt();
				System.out.println("Enter the book name");
				sc.nextLine();
				String bookName = sc.nextLine();
				System.out.println("Enter the author name");
				String author = sc.nextLine();

				Book book = new Book(isbn, bookName, author);
				library.addBook(book);
				break;

			case 2:
				List<Book> books = library.viewAllBooks();
				for (Book eachBook : books) {
					System.out.println("===========================");
					System.out.println(
							"Author is " + eachBook.getAuthor() + " and " + "book name is " + eachBook.getBookName());
					System.out.println("============================");
				}
				break;

			case 3:
				System.out.println("Enter the author name: ");
				sc.nextLine();
				String authors = sc.nextLine();
				List<Book> book1 = library.viewBooksBYAuthor(authors);
				if (book1 == null) {
					System.out.println("The list is empty");
				} else {
					for (Book eachBook : book1) {
						System.out.println("===========================");
						System.out.println("Author is " + eachBook.getAuthor() + " and " + "book name is "
								+ eachBook.getBookName());
						System.out.println("============================");
					}
				}
				break;

			case 4:
				System.out.println("Please enter author name you want to search the books: ");
				sc.nextLine();
				String authors1 = sc.nextLine();
				int count = library.countNoOfBook(authors1);
				System.out.println("The number of book by authors are " + count);
				break;

			case 5:
				printMenu();
				break;

			case 6:
				System.out.println("Please visit again");
				quit = true;
				break;
			}

		}
	}

	public static void printMenu() {
		System.out.println("1. Add Book");
		System.out.println("2. Display all book details");
		System.out.println("3. Search Book by author");
		System.out.println("4. Count number of books - by book name");
		System.out.println("5. Print Choices");
		System.out.println("6. Exit");
	}

}
