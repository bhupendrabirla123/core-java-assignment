package com.kaizen.newpractice;

public class nestedfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i= 0; i<=n;i++) {
			for (int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
