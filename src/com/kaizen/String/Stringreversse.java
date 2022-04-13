package com.kaizen.String;

public class Stringreversse {
	public static void main(String[] args) {
		String name = "Bhupendra";
		for (int i = name.length() - 1; i >= 0; i--) {
			char rev = name.charAt(i);
			System.out.print(rev);

		}
	}
}
