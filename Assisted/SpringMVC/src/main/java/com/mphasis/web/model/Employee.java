package com.mphasis.web.model;

public class Employee {

	private int empid;
	private String name;
	private double salary;
	private String dept;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String name, double salary, String dept) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
}
