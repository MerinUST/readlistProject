package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ReadList {
	@Id
    private long readListId;
    private String username;
    private String isbn;
    private String bookId;
	public long getReadListId() {
		return readListId;
	}
	public void setReadListId(long readListId) {
		this.readListId = readListId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public ReadList(long readListId, String username, String isbn, String bookId) {
		super();
		this.readListId = readListId;
		this.username = username;
		this.isbn = isbn;
		this.bookId = bookId;
	}
	public ReadList() {
		// TODO Auto-generated constructor stub
	}
    
    
}
