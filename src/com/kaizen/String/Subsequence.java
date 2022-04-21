package com.kaizen.String;

public class Subsequence {

	public static void checksubseq(String str) {
		String s;
		int min = 2;
		String st;
		for (int i = 0; i < str.length() / 2; i++) {
			if (min <= str.length() / 2) {
				s = "";
				int count;
				for (int j = 0; j < str.length(); j++) {
					char ch = str.charAt(j);
					count = 0;
					s = s + ch;
					st = "";
					int a = 0;
					if (s.length() == min) {
						for (int k = 0; k < str.length(); k++) {
							char c = str.charAt(k);
							st = st + c;
							if (st.length() == min) {
								if (s.equals(st)) {
									count++;
									a = j;
								}
								st = "";
								k--;
							}
						}
						System.out.println(s + " = " + count);
						s = "";
						j--;
					}

				}

			}

			min++;
		}

	}

	public static void main(String[] args) {
		String str = "ABCDEFABC";
		checksubseq(str);
	}

}
