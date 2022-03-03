package com.mphasis.spring.SpringCoreDemo.Singer;

import org.springframework.stereotype.Component;
@Component
public class Violin implements Instrument{
	@Override
	public void play() {
		System.out.println("playing violin");
		
	}
	
}