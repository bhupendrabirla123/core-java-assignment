package com.kaizen.String;

public class Replacingvovels {
	public static void main(String[] args) {
		String a = "i am bhupendra . i am  complete my graduation in year 2020, hijwidhweucheuchsduchcui";
		char arr[] = { 'a', 'e', 'i', 'o', 'u' };
		char b = 'A';
		String store = "";
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			for (int j = 0; j < arr.length; j++) {
				if (ch == arr[j]) {
					System.out.println(ch + "=" + b);
					ch = b;
					b = (char) (b + 1);
				}
			}
			store = store + ch;
		}
		System.out.print(store);
	}

}
