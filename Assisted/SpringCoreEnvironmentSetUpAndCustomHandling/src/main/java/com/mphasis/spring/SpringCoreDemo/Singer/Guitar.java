package com.mphasis.spring.SpringCoreDemo.Singer;

import org.springframework.stereotype.Component;
//spring managed bean
@Component
public class Guitar implements Instrument{
	@Override
	public void play() {
		System.out.println("playing guitar");
		
	}
	
}