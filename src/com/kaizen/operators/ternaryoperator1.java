package com.kaizen.operators;

public class ternaryoperator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 47;
		int y;
		y=(x<=10)?1:2;
		switch(y) {
		case 1:
			System.out.println(x+ "  is less than 10");
			break;
		case 2:
			System.out.println(x+ "  is greater than 10");
		}
	

	}

}
