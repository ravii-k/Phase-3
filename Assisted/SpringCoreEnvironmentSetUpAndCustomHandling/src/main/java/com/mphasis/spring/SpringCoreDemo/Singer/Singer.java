package com.mphasis.spring.SpringCoreDemo.Singer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Singer {
	
	
	@Value("S001")
	private String singerid;
	@Value("Justin Beiber")
	private String singername;
	@Autowired
	@Qualifier("guitar")
	private Instrument instrument;
	
	public Singer() {
		
		System.out.println("Singer constructor");
	}
	public void singing()
	{
		System.out.println(singername+" singing the song");
		instrument.play();
	}
	public String getSingerid() {
		return singerid;
	}
	public void setSingerid(String singerid) {
		this.singerid = singerid;
	}
	public String getSingername() {
		return singername;
	}
	public void setSingername(String singername) {
		this.singername = singername;
	}
	public Instrument getInstrument() {
		return instrument;
	}
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	@Override
	public String toString() {
		return "Singer [singerid=" + singerid + ", singername=" + singername + ", instrument=" + instrument + "]";
	}
	
	
	
}