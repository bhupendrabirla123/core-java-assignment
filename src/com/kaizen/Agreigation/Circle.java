package com.kaizen.Agreigation;

import java.util.Scanner;

public class Circle {
	
	
	Operations op;
	public double Circle(int r) {
		
		op = new Operations();
		int squ = op.square(r);
		return Math.PI*squ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int rad=in.nextInt();
		Circle c = new Circle();
		double d = c.Circle(rad);
		System.out.println(d);
	}

}
