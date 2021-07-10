package com.demo;




public class Book {
 
 private String bookId;
  
  private String bookName;
  private String author;
  private String description;
  private String price;
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(String bookId, String bookName, String author, String description, String price) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.author = author;
	this.description = description;
	this.price = price;
}
public String getBookId() {
	return bookId;
}
public void setBookId(String bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
  
  
	
}
