package com.kaizen.wrapperclasses;

public class findintusingclasses {
	static char [] arr;
	public static void main(String[] args) {
		String str = "fs6idue8n84i";
		arr = new char[str.length()];
		for (int i = 0; i<str.length();i++) {
			char ch = str.charAt(i);
			arr[i]=ch;
			if (Character.isDigit(arr[i])) {
				System.out.println(arr[i]);
				
			}
//			else {
//				System.out.println(arr[i]);
//			}
			
		}
	
	}
}
