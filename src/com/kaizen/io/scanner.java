package com.kaizen.io;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// define scanner object
		Scanner in = new Scanner(System.in);
		// take user name
		System.out.println("Enter name");
		String Name = in.next();
		
		// take users surname
		System.out.println("surname ");
		String surname = in.next();
		System.out.println("your name is " + Name +" "+  surname);
		
		
		//take users age
		System.out.println("Enter your age?");
		int age = in.nextInt();
		System.out.println("your age is "+ age);
		

	}

}
