package com.sunbeam;

public class Employee {
	private String f_name; 
	private String l_name;
	private double salary;
	public Employee(String f_name, String l_name, double salary) {
		this.f_name = f_name;
		this.l_name = l_name;
		this.salary = salary;
	}
	public Employee() {
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if(salary<0) {
			this.salary=0.0;
		}
		else {
			this.salary = salary;
		}
	}
	
	public double raiseSalary() {
		return salary+0.1*salary;
	}
	
	
	
}
