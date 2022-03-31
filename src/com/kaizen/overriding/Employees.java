package com.kaizen.overriding;

public class Employees {
	
	private int salary;
	String name;
	int age;
public void setsalary(int salary) {
	this.salary= salary;
	
	}
	public int getsalary() {
		
		return salary;
	}
	
	public static void main(String[] args) {
		Employees E = new Employees();
		
	}

}
