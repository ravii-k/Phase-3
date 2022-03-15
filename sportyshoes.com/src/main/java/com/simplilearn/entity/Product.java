package com.simplilearn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@Column(name="name")
	private String name;
	
	@Column(name="company")
	private String company;
	
	@Column(name="size")
	private int size;
	
	@Column(name="price")
	private int price;
	
	
	@Column(name="image_link")
	private String image_link;


	public Product() {

	}


	public Product(String name, String company, int size, int price, String image_link) {
		super();
		this.name = name;
		this.company = company;
		this.size = size;
		this.price = price;
		this.image_link = image_link;
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


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getImage_link() {
		return image_link;
	}


	public void setImage_link(String image_link) {
		this.image_link = image_link;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", company=" + company + ", size=" + size + ", price=" + price
				+ ", image_link=" + image_link + "]";
	}
	
	

}
