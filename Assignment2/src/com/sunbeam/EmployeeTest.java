package com.sunbeam;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.setF_name("Sakshi");
		e1.setL_name("Bhusal");
		e1.setSalary(-1000.00);
		System.out.println("First name: "+e1.getF_name());
		System.out.println("Last name: "+e1.getL_name());
		System.out.println("Yearly Salary "+e1.getSalary());
		System.out.println("Raised Salary by 10%: "+e1.raiseSalary());
		e2.setF_name("Abha");
		e2.setL_name("Bhujbal");
		e2.setSalary(9000.00);
		System.out.println("First name: "+e2.getF_name());
		System.out.println("Last name: "+e2.getL_name());
		System.out.println("Yearly Salary "+e2.getSalary());
		System.out.println("Raised Salary by 10%: "+e2.raiseSalary());
		
	}

}
