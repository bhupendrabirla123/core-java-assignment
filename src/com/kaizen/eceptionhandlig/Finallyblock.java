package com.kaizen.eceptionhandlig;

import java.rmi.AccessException;

public class Finallyblock {
	
	// yes we can create finally block without a catch block
	
	public static void main(String[] args) {
		
		try {
			System.out.println("in try");
			
		}
		catch (ArithmeticException  | ArrayIndexOutOfBoundsException e) {
			e.fillInStackTrace();
		}
		// we can create finally block without creating catch block
		finally {
			System.out.println("in finally");
		}
		
		
	}
	

}
