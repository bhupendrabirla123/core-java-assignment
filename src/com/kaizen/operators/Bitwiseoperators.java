package com.kaizen.operators;

public class Bitwiseoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5; //= 0101 (in binary)
		int b = 7;  //= 0111 (in binary)
		// bitwise OR operator 
		System.out.println(a|b);
		// bitwise AND operator
		System.out.println(a & b);
		//bitwise XOR operator
		System.out.println(a ^ b);
		//compliment operator
		System.out.println(~b);

	}

}
