package com.kaizen.eceptionhandlig;

public class Throwskey {
	
	public static void throwsexceptio() throws ArithmeticException {
		int a= 10;
		int b =0;
		System.out.println(a/b);
	}
	public static void main(String[] args)  {
		
		try {
			throwsexceptio();
			
		}catch (ArithmeticException e){
			System.out.println("Enter right value");
		}
	}
	

}
