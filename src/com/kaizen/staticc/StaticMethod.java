package com.kaizen.staticc;

public class StaticMethod {
	
	static String name;
	long ContactNo;
	// if we declare "ContactNo" as static than it can be used in static 
	// method and in static block
	
	// static block
	static {
	name = "Bhupendra";
	// ContactNo = 1234567890;
	// can not initialize non static variables here
	}
	
	// static method
	public static void print() {
		System.out.println(name);
		// System.out.println(ContactNo);
		// can not print non static variables here
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod.print();
		StaticMethod.name = "Amit";
		StaticMethod.print();

	}

}
