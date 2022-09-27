package com.ques4;

import java.util.ArrayList;
import java.util.List;

public class Library {

	List<Book> bookList = new ArrayList<>();

	public void addBook(Book book) {
		bookList.add(book);
		System.out.println("Book added successfully");
	}

	public boolean isEmpty() {
		if (bookList.size() == 0) {
			return true;
		}
		return false;
	}

	public List<Book> viewAllBooks() {
		return this.bookList;
	}

	public List<Book> viewBooksBYAuthor(String author) {
		List<Book> bookByAuthor = new ArrayList<>();

		for (Book books : bookList) {
			if (books.getAuthor().equals(author)) {
				bookByAuthor.add(books);
			}
		}
		if (bookByAuthor.size() == 0) {
			return null;
		} else {
			return bookByAuthor;
		}

	}

	public int countNoOfBook(String bookName) {
		int count = 0;

		for (Book book : bookList) {
			if (book.getBookName().equals(bookName)) {
				count++;
			}
		}
		return count;
	}

}
