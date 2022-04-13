package com.kaizen.String;

public class Sentencerev {
	public static void main(String[] args) {
		String sen = "i am bhupendra birla";
		String arr[] = sen.split(" ");
		String str = "";

		for (int i = 0; i < arr.length; i++) {
			str = arr[i];
			String a = "";
			String rev = " ";
			for (int j = str.length() - 1; j >= 0; j--) {
				rev = rev + "" + str.charAt(j);
				a = rev;
			}
			// rev = rev.trim();
			System.out.print(rev);

		}
	}

}
