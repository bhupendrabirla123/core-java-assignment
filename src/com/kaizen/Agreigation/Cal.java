package com.kaizen.Agreigation;

import java.util.Scanner;

public class Cal {
	SumOL sum;
	SubOL sub;
	MulOL mul;
	DivOL div;
	
	public void cal() {
		sum = new SumOL();
		sub = new SubOL();
		mul = new MulOL();
		div = new DivOL();
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter a number: ");
		int a = in.nextInt();
		System.out.println("Pleaase Enter Second number: ");
		int b = in.nextInt();
		System.out.println("Please Enter a operation: ");
		String m = in.next();
		
if (m.equalsIgnoreCase("sum")) {
	System.out.println(sum.sum(a, b));
//	System.out.println(sum.sum(a, b));
		}else if(m.equalsIgnoreCase("sub")){
			System.out.println(sub.sub(a, b));
//			sub.sub(a, b);
		}else if(m.equalsIgnoreCase("mul")) {
			System.out.println(mul.mul(a, b));
			mul.mul(a, b);
			mul.mul(a, b);
		}else if (m.equalsIgnoreCase("div")) {
			System.out.println(div.div(a, b));
			div.div(a, b);
		}else {
			System.out.println("Please enter a valid method");
		}
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal c = new Cal();
		c.cal();
	}

}
