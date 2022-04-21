package com.kaizen.wrapperclasses;

public class Addingintbetweenchars {
	static char[] arr;

	public static void main(String[] args) {
		String str = "6yu37j7ee7d63jk38m3m4m4e223a3";
		arr = new char[str.length()];
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			arr[i] = ch;

		}

		for (int i = 0; i < arr.length; i++) {
			if (Character.isDigit(arr[i])) {

				String p = Character.toString(arr[i]);
				int m = i + 1;
				int n;
				for (int j = m; j < arr.length; j++) {
					if (Character.isDigit(arr[j])) {
						p = p + Character.toString(arr[j]);
						i = j;
					} else {
						break;
					}
				}
				// System.out.print(" " + p + " ");
				n = Integer.parseInt(p);
				sum = sum + n;
			}
		}
		System.out.println("The sum of numbers is: " + sum);

	}

}
