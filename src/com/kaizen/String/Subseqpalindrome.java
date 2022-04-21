package com.kaizen.String;

public class Subseqpalindrome {
	static char ch;
	static String str;
	static String arr[];
	static String s;
	static int m;

	public static String[] getchar(String str) {
		s = "";
		m = 0;
		int min = 2;
		arr = new String[str.length() * 3];
		for (int j = 0; j < str.length() / 2; j++) {
			s = "";
			for (int i = 0; i < str.length(); i++) {
				ch = str.charAt(i);
				s = s + ch;
				if (s.length() == min) {
//					for (int k = 0; k < arr.length; k++) {
//						if (s.equals(arr[k])) {
//							s = "";
//							s.trim();
//						}
//					}
					arr[m] = s;
					// System.out.print(arr[m] + " ");
					m++;
					i--;

					if (s.length() == 3) {
						i--;
					}
					s = "";
				}

			}

			min++;
		}

		return arr;
	}

	public static void checkpali(String arr[]) {
		try {
			for (int i = 0; i < arr.length; i++) {
				String s = "";
				String str = arr[i];
				for (int j = str.length() - 1; j >= 0; j--) {
					char ch = arr[i].charAt(j);
					s = s + ch;
				}
				if (s.equals(arr[i])) {
					System.out.println(arr[i] + " is palindrome");
				}
			}
		} catch (NullPointerException e) {
		}

	}

	public static void main(String[] args) {
		String s = "MMOMMddadd";
		arr = getchar(s);
		checkpali(arr);
	}
}
