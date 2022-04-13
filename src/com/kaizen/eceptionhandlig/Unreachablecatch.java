package com.kaizen.eceptionhandlig;

public class Unreachablecatch {
	
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int arr[] = new int[6];
			System.out.println(a/b);
		}
		System.out.println("hello");
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("hello");
		}
	}

}
