package com.kaizen.staticc;

public class Staticinjava {
	int rollNo;
	// this instance variable can not be used by the static class
	// but a non static class can access both static and non static 
	// variables.
	static String name;
	static String college = "SVCE";
	static int count = 0;
	
	static {
		// "static" here is static block which can be used to initialize 
		// static variables
		//this is executed before main method.
		System.out.println("in static block");
		 name = "Bhupendra";
	//System.exit(0);
		// the line is used for exiting after the block
		// this will not allow main methode to execute
	}
	Staticinjava(int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
		count++;
	}
	public void show() {
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(college);
	}
	public static void print() {
		System.out.println("in print");
		System.out.println(name);
		System.out.println(college);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Staticinjava obj = new staticinjava(101,"Rounak");
		// Staticinjava obj1 = new staticinjava(102,"Julee");
		// obj.show();
		// System.out.println("*******");
		Staticinjava.college = "oriental";
		/// obj.show();
		// System.out.println("**********");
		// obj1.show();
		Staticinjava.print();
		double d = Math.pow(2, 2);
		System.out.println(d);

	}

}
