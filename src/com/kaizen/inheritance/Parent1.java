package com.kaizen.inheritance;

import java.util.Scanner;

public class Parent1 {
	static int a;
	static int b;
	
	public int sum() {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		a= in.nextInt();
		System.out.println("Second Number: ");
		b= in.nextInt();
		System.out.println("The Sum is: " + (a+b));
		return 0;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 obj = new Parent1();
		
		System.out.println(obj.sum());

	}

}
