package com.que1;

import java.util.Comparator;

public class BookIdComp implements Comparator<Book> {

	@Override
	public int compare(Book book1, Book book2) {

		if (book1.getBookId() == book2.getBookId()) {
			return 0;
		} else if (book1.getBookId() > book2.getBookId()) {
			return 1;
		} else {
			return -1;
		}
	}

}
