package com.kaizen.day6assignment;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
			
		
		Scanner in = new Scanner(System.in);
		System.out.println("please Enter a number above 3 ");
		int n = in.nextInt();
		
		if (n<=3) {
			System.out.println("invalid numer");
			return;
		}
		
		for (int i = 0; i <n;i++) {
			for (int j=n-1; j>=1;j--) {
				System.out.print(" ");
			}
			for (int j=0; j<=i;j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}
}