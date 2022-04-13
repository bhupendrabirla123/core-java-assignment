package com.kaizen.String;

import java.util.Scanner;

public class Replacewovelswithz {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("Enter a String ");
			String name = in.next();
			char wovels[] = { 'a', 'e', 'i', 'o', 'u' };

			for (int i = 0; i < name.length(); i++) {
				char ch = name.charAt(i);
				for (int j = 0; j < wovels.length; j++)

					if (ch == wovels[j]) {
						ch = 'z';
					}
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
