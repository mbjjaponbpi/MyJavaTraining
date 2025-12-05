package com.bea.test;

public class Book {

	
	String publisher = "Bloomsbury";
	String author;
	String title;
	
	public void scanBook() {
		System.out.println("Scanning the book authored by " + author + "...");
		
	}
	public String getPublisher() {
		System.out.println("Publisher is " + publisher);
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		System.out.println("Author is " + author);
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		System.out.println("Book title is " + title);
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
