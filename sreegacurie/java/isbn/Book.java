package org.isbn.bk;
import java.util.Date;
public class Book {
	int id;
	String name;
	String publisher;
	String author;
	double price;
	Date published_date;
	String isbn_number;
	public Book(int id, String name, String publisher, String author, double price, Date published_date1,
			String isbn_number) {
		this.id = id;
		this.name = name;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.published_date = published_date1;
		this.isbn_number = isbn_number;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getPublished_date() {
		return published_date;
	}
	public void setPublished_date(Date published_date) {
		this.published_date = published_date;
	}
	public String getIsbn_number() {
		return isbn_number;
	}
	public void setIsbn_number(String isbn_number) {
		this.isbn_number = isbn_number;
	}
	
	

}
