package com.kaizen.String;

public class Substringpalindrome {
	public static void main(String[] args) {
		String sen = "I loves mom and dad";
		String[] arr = sen.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String temp = arr[i];
			String rev = "";
			int count = 0;
			// this loop is for reversing the sub String
			for (int j = temp.length() - 1; j >= 0; j--) {
				char ch = temp.charAt(j);
				rev =  rev+ ch;
				if (temp.equals(rev)) {
					System.out.println("Palindrome sub string is: " + temp);
				}
			}
		}

	}

}
