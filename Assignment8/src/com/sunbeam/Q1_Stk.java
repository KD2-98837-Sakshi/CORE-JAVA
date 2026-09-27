
package com.sunbeam;

import java.util.ArrayList;

class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return "Id: " + id + ", Name: " + name + ", Salary: " + salary;
	}
}

interface Stack {
	int STACK_SIZE = 5;

	void push(Employee e);

	Employee pop();
}

class FixedStack implements Stack {
	private ArrayList<Employee> list = new ArrayList<Employee>();

	public void push(Employee e) {
		if (list.size() == STACK_SIZE)
			System.out.println("Stack Full");
		else
			list.add(e);
	}

	public Employee pop() {
		if (list.isEmpty()) {
			System.out.println("Stack Empty");
			return null;
		}
		return list.remove(list.size() - 1);
	}
}

class GrowableStack implements Stack {
	private ArrayList<Employee> list = new ArrayList<Employee>();

	public void push(Employee e) {
		list.add(e);
	}

	public Employee pop() {
		if (list.isEmpty()) {
			System.out.println("Stack Empty");
			return null;
		}
		return list.remove(list.size() - 1);
	}
}
