package com.mphasis.spring.SpringCoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mphasis.spring.SpringCoreDemo.model.Author;
import com.mphasis.spring.SpringCoreDemo.model.Book;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-core.xml");
		Author author = (Author) context.getBean("a1");
		System.out.println(author);
		
		Book book = context.getBean(Book.class);
    	System.out.println(book);
	}
}
