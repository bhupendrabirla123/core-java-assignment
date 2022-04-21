package com.kaizen.String;

public class Pickchar {
	static char ch;
	static String str;
	static String arr[];
	static String s;
	static int m;
	static String use[];

	public static String[] getchar(String str) {
		s = "";
		m = 0;
		int min = 2;
		arr = new String[str.length() * 2];
		for (int j = 0; j < str.length() / 2; j++) {
			s = "";
			for (int i = 0; i < str.length(); i++) {
				ch = str.charAt(i);
				s = s + ch;
				if (s.length() == min) {
					for (int k = 0; k < arr.length; k++) {
						if (s.equals(arr[k])) {
							s = "";
							s.trim();
						}
					}
					arr[m] = s;
					System.out.print(arr[m] + " ");
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

	public static void m1(String arr[], String str) {
		s = "";
		m = 0;
		int min = 2;
		int count = 0;
		for (int j = 0; j < str.length() / 2; j++) {
			s = "";
			for (int i = 0; i < str.length(); i++) {
				ch = str.charAt(i);
				s = s + ch;
				if (s.length() == min) {
					for (int k = 0; k < arr.length; k++) {
						if (s.equals(arr[k])) {
							count++;
						}
						System.out.println(arr[m] + " " + count);
						count = 0;
					}

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
	}

//	public static String[] resize(String arr[]) {
//		String ar= Array.cop;
//		for (int i =0; i<arr.length;i++) {
//			
//		}
//		
//		return arr;
//	}
//	public static void check(String arr[], String str) {
//		try {
//			for (int i = 0; i < str.length() / 2 - 1; i++) {
//				s = "";
//				int count = 0;
//				int min = 2;
//				for (int j = 0; j < str.length(); j++) {
//					char ch = str.charAt(j);
//					s = s + ch;
//					if (s.length() < min) {
//						for (int k = 0; k < arr.length - 1; k++) {
//							if (arr[k].equals(s)) {
//								count++;
//								System.out.println(count + " " + s);
//								System.out.print(arr[k] + " ");
//							}
//						}
//					}
//				}
//			}
//		} catch (NullPointerException e) {
//
//		}
//	}

	public static void main(String[] args) {
		str = "ABCDEF";
		String ar[] = getchar(str);
		System.out.println();
		m1(ar, str);
		// check(ar, str);
	}
}