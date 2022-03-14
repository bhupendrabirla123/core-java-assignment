package com.kaizen.day6assignment;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		// for (; ; ){
		while (true) {
			System.out.println("Enter Loan Amount or enter 0 to exit ");

			Double Loanamount = in.nextDouble();
			if (Loanamount == 0) {
				break;
				// we can use while loop with this breaking condition too.
			}
			System.out.println("Enter Interest % ");

			Double interest = in.nextDouble();
			System.out.println("Enter Duration (in months)  ");
			int Duration = in.nextInt();
			System.out.println("Your interest is: " + ((Loanamount * interest * Duration) / 100));

		}
	}
}
// }
