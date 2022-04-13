package com.kaizen.eceptionhandlig;

public class CheckException {
	
	public static void main(String[] args) {
		
		System.out.println(1/0);
		// The above will throw the error
		// and the error will be ArithmeticException: /by zero
		System.out.println(2.0/0);
		// This one will print the positive infinity
		
		
	}
	

}
