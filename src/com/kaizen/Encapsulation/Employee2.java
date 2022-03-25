package com.kaizen.Encapsulation;

public class Employee2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj = new Employee();
		
		
		obj.setid(10);
		obj.setName("Bhupendra");
		obj.setsalary(10_000);
		System.out.println(obj.getid());
		System.out.println(obj.getName());
		System.out.println(obj.getsalary());
	}

}
