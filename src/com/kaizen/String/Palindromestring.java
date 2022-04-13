package com.kaizen.String;

import java.util.Scanner;

public class Palindromestring {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {

			System.out.println("Enter a String to check palindrome or not");
			String s = in.next();
			String ch = "";

			for (int i = s.length() - 1; i >= 0; i--) {
				ch = ch + s.charAt(i);
			}
			if (s.equalsIgnoreCase(ch)) {
				System.out.println("Palindrome string: " + s);
			} else {
				System.out.println("Not a palindrome string: " + s);
			}

		}
	}
}
