package com.mphasis.spring.SpringCoreDemo.model;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CollDemo {
@Autowired
private List<String> fruits;
@Autowired
private Set<String> certificates;
public List<String> getFruits() {
	return fruits;
}
public void setFruits(List<String> fruits) {
	this.fruits = fruits;
}
public Set<String> getCertificates() {
	return certificates;
}
public void setCertificates(Set<String> certificates) {
	this.certificates = certificates;
}



	}


