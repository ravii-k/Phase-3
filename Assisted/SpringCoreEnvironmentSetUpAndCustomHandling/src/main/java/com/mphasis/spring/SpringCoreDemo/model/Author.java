package com.mphasis.spring.SpringCoreDemo.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("a1")
public class Author {
	@Value("1")
	private int aid;
	@Value("Mohan")
	private String aname;
	@Value("mohan@gmail.com")
	private String email;
	@Value("Entertaine")
	private String genre;

	public Author() {
		System.out.println("Author object created");
	}

	public Author(int aid, String aname, String email, String genre) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.email = email;
		this.genre = genre;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Author [aid=" + aid + ", aname=" + aname + ", email=" + email + ", genre=" + genre + "]";
	
}
}
