package com.ques4;

public class Book {
	private int isbn;
	private String bookName;
	private String author;

	public Book(int isbn, String bookName, String author) {
		this.isbn = isbn;
		this.bookName = bookName;
		this.author = author;
	}

	public int getIsbn() {
		return isbn;
	}

	public String getBookName() {
		return bookName;
	}

	public String getAuthor() {
		return author;
	}

}
