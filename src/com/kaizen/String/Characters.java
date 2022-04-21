package com.kaizen.String;

public class Characters {

	public static char arr[];
	public static boolean check(char ch) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		String name = "rr am rr himanshu";
		name = name.toLowerCase();
		
		arr = new char[name.length()];
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			int count = 0;
			if (check( ch)) {
				arr[i] = ch;
				for (int j = i; j < name.length(); j++) {
					char c = name.charAt(j);
					if (c == ch) {
						count++;
					}
				}
				System.out.println(arr[i] + " " + count);
			}
		}
	}

}
