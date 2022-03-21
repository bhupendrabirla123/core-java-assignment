package com.kaizen.day6assignment;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name ");
		String name = in.next();
		System.out.println("Enter last name ");
		String surname = in.next();
		System.out.println("Enter your age ");
		int age = in.nextInt();
		System.out.println(" Enter your address ");
		String address = in.next();
		System.out.println();
		System.out.printf("Name: "+ name+"\t" + surname);
		System.out.println();
		System.out.print("age: "+ age);
		System.out.println();
		System.out.printf("Address: "+ address);
		

	}

}
