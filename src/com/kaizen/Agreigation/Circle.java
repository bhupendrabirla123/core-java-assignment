package com.kaizen.Agreigation;

public class Circle {
	
	
	Operations op;
	public double Circle(int r) {
		op = new Operations();
		int squ = op.square(r);
		return Math.PI*squ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		double d = c.Circle(12);
		System.out.println(d);
	}

}
