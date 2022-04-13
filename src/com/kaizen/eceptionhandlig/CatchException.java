package com.kaizen.eceptionhandlig;

import java.util.Scanner;

public class CatchException {
		static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int a = 10;
		System.out.println("Enter a numbr");
		int b = in.nextInt();
		// if the user assigns the value as zero
		
		try {
			System.out.println(a/b);
		}
		catch (ArithmeticException e) {
			// the exceptions are catched in catch block and can give a message here 
			System.out.println("Please Enter a valid number");
		}
		
	}
	
	

}
