package com.kaizen.wrapperclasses;

public class Addingdigitsinstring {
	static char arr[];
	public static void main(String[] args) {
		String str = "ffs76jy48rr874er";
		arr = new char[str.length()];
		int sum=0;
		for(int i = 0; i<str.length();i++) {
			char ch = str.charAt(i);
			arr[i] = ch; 
			if (Character.isDigit(arr[i])) {
				String s = Character.toString(arr[i]);
				int con = Integer.parseInt(s);
				
				sum = sum +con;
			}
		}
		System.out.println(sum);
	}

}
