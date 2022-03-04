package com.mphasis.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.web.db.EmployeeDB;
import com.mphasis.web.model.Employee;

@Service
public class EmployeeService {
	@Autowired
 private EmployeeDB empdb;
 public boolean insertEmployee(Employee emp) {
	long count = this.empdb.count();
	emp.setEmpid((int)count+1);
	System.out.println("before inserting");
	System.out.println(emp);
	if (this.empdb.insertEmployee(emp))
	 return true;
	 return false;
	 
 }
}
