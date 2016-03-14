package com.training.entity;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Book {

	Logger log = Logger.getLogger(this.getClass().getName());

	private long bookNumber;
	private String bookName;
	private String subject;
	@Autowired
	private Isbn isbn;

	
	
	public Isbn getIsbn() {
		return isbn;
	}

	public void setIsbn(Isbn isbn) {
		this.isbn = isbn;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public long getBookNumber() {
		log.info("get book number called");
		return bookNumber;
	}

	public void setBookNumber(long bookNumber) {
		log.info("number setter called");
		this.bookNumber = bookNumber;
	}

	public String getBookName() {
		log.info("get book name called");
		return bookName;
	}

	public void setBookName(String bookName) {
		log.info("name setter called");
		this.bookName = bookName;
	}

	public Book(long bookNumber, String bookName) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookName=" + bookName + "]";
	}

}
