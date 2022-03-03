package com.mphasis.spring.SpringCoreDemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
	
	@Value("100")
	private int bid;
	@Value("Adventure")
	private String title;
	@Value("159.35")
	private double price;
	@Autowired
	private Author author;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(int bid, String title, double price, Author author) {
		super();
		this.bid = bid;
		this.title = title;
		this.price = price;
		this.author = author;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", title=" + title + ", price=" + price + ", author=" + author + "]";
	}
	
	
	
}
