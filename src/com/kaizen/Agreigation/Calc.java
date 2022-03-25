package com.kaizen.Agreigation;

import java.util.Scanner;

public class Calc {
	int i,j;
	SumOL sum;
	CombineOL comb;
	

	public int sum (int i, int j) {
		this.i = i;
		this.j=j;
		sum = new SumOL();
		int d= sum.sum(i, j);
		//System.out.println(d);
		return d;
	}
	public int input() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Number: ");
		i = in.nextInt();
		j = in.nextInt();
		return i;
		return j;
	}
	
	public void cal() {
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
