package com.mphasis.web.controller;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.mphasis.web.model.Employee;
import com.mphasis.web.service.EmployeeService;


@Controller
public class HomeController {
	@Autowired
	private EmployeeService service;  
	public HomeController() {
		System.out.println("Home constructer");
	}
	
	
@GetMapping("/greet")
	public String message() {
		return "welcome";
	}
@GetMapping("/register")
public String registerEmployee(Map<String,List<String>> map) {
	map.put("departments", Arrays.asList("IT","Finance","HR","Traine","Admin"));
	return "register";
}

@PostMapping("/register")
public String insertEmployee(Employee emp) {
	System.out.println(emp);
	if(this.service.insertEmployee(emp))
	return "welcome";
	else
		return "register?error=Register failed";
}
}
