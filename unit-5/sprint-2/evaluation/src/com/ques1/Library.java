package com.ques1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Library {

	public static List<Book> bookList = new ArrayList<>();

	public void addBook(Book book) throws BookException {
		boolean flag = false;

		for (int i = 0; i <= bookList.size() - 1; i++) {
			if (book.getIsbn() == bookList.get(i).getIsbn() && book.getBookName().equals(bookList.get(i).getBookName())
					&& book.getAuthor().equals(bookList.get(i).getAuthor())) {
				flag = true;
			}
		}
		if (flag == true) {
			throw new BookException("Book is already exist.");
		} else {
			bookList.add(book);
			System.out.println("Book added successfully");
		}
	}

	public List<Book> viewAllBooks() throws BookException {
		if (bookList.size() == 0) {

			throw new BookException("There is no book availble at the moment.");

		} else {
			Collections.sort(bookList, (book1, book2) -> book1.getBookName().compareTo(book2.getBookName()));
		}
		return bookList;
	}

	public List<Book> viewBooksByAuthor(String author) throws BookException {

		List<Book> booksByAuthors = new ArrayList<>();
		boolean flag = false;
		for (int i = 0; i <= bookList.size() - 1; i++) {
			if (bookList.get(i).getAuthor().equals(author)) {
				booksByAuthors.add(bookList.get(i));
				flag = true;
			}
		}
		if (flag == false) {
			throw new BookException("None of the book published by the author " + author);
		} else {
			return booksByAuthors;
		}

	}

	public Book getBookByISBN(int isbn) throws BookException {

		boolean flag = false;
		for (int i = 0; i <= bookList.size() - 1; i++) {
			if (bookList.get(i).getIsbn() == isbn) {
				flag = true;
				return bookList.get(i);

			}
		}
		if (flag == false) {
			throw new BookException("isbn not found ");
		} else {
			return null;
		}

	}

	public void displayMenu() {
		System.out.println("1.Add Book");
		System.out.println("2.Display all book details");
		System.out.println("3.Search Book by author");
		System.out.println("4.Search book by ISBN");
		System.out.println("5.Exit");

	}

	public static void main(String[] args) {
		try {
			Library library = new Library();
			Scanner sc = new Scanner(System.in);
			boolean quit = false;
			library.displayMenu();
			while (!quit) {

				System.out.println("Please enter your choice");
				int chooise = sc.nextInt();

				switch (chooise) {

				case 1: {
					System.out.println("Please enter book Name");
					String name = sc.next();
					System.out.println("Please enter book id");
					int id = sc.nextInt();
					System.out.println("Please enter book author");
					String author = sc.next();

					Book book = new Book(id, name, author);
					library.addBook(book);
					break;
				}
				case 3: {
					System.out.println("Please enter author name you want to search");
					String author = sc.next();
					List<Book> books = library.viewBooksByAuthor(author);
					books.forEach(book -> System.out.println("Book name is " + book.getBookName() + " Book author is "
							+ book.getAuthor() + " Book id is " + book.getIsbn()));
					break;
				}
				case 2: {
					List<Book> books = library.viewAllBooks();
					books.forEach(book -> System.out.println("Book name is " + book.getBookName() + " Book author is "
							+ book.getAuthor() + " Book id is " + book.getIsbn()));
					break;
				}

				case 4: {
					System.out.println("Please enter isbn");
					int isbn = sc.nextInt();

					Book book = library.getBookByISBN(isbn);

					System.out.println("Book name is " + book.getBookName() + " Book author is " + book.getAuthor()
							+ " Book id is " + book.getIsbn());

					break;
				}
				case 5: {
					quit = true;
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + chooise);
				}
			}

		} catch (BookException exception) {
			System.out.println(exception.getMessage());
		}

	}
}
