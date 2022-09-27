package com.que1;

public class Book {
	private int bookId;
	private String bookName;
	private String author;

	public Book(int bookId, String bookName, String author) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
	}

	@Override
	public boolean equals(Object obj) {
		Book book1 = this;
		Book book2 = (Book) obj;

		if (book1.getBookId() == book2.getBookId()) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + "]";
	}

	public int getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public String getAuthor() {
		return author;
	}

}
