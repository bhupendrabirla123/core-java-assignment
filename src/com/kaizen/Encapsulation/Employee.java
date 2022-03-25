package com.kaizen.Encapsulation;

public class Employee {
	private int id;
	private String Name;
	private int salary;
	public int setid(int id) {
		this.id = id;
		return id;
	}
	public int setsalary(int salary) {
		this.salary= salary;
		return salary;
	}
	public String setName(String Name) {
		this.Name = Name;
		return Name;
	}
	public int getid() {
		return id;
	}
	public int getsalary() {
		return salary;
	}
	public String getName() {
		return Name;
	}

}
