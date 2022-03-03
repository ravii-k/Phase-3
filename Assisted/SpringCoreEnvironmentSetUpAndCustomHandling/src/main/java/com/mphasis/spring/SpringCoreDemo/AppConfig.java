package com.mphasis.spring.SpringCoreDemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mphasis.spring.SpringCoreDemo.Singer.Singer;
import com.mphasis.spring.SpringCoreDemo.model.Author;
import com.mphasis.spring.SpringCoreDemo.model.CollDemo;

@Configuration // replacing the xml file
// replacing the <component-scan> tag
@ComponentScan(basePackages = {"com.mphasis.spring.SpringCoreDemo.model"
		,"com.mphasis.spring.SpringCoreDemo.singer"}
)
public class AppConfig {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		/*
		 * Author author = context.getBean(Author.class); System.out.println(author);
		 * Singer singer = context.getBean(Singer.class); singer.singing();
		 */
	CollDemo cdemo = context.getBean(CollDemo.class);
	System.out.println(cdemo.getFruits());
	System.out.println(cdemo.getCertificates());
	
}
	
	@Bean
	public List<String> getFruits()
	{
		System.out.println("getting fruits...");
		return Arrays.asList("Apples","Banana","Oranges");
	}
	@Bean
	public Set<String> getCertificates()
	{
		System.out.println("getting certificate...");
		Set<String> set = new HashSet<String>();
		set.add("OCJP");
		set.add("AWS Solution Architect");
		set.add("CCNA");
		return set;
	}
}