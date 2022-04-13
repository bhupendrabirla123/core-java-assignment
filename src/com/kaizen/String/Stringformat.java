package com.kaizen.String;

public class Stringformat {
	public static void main(String[] args) {
		String name = "Bhupendra";
		String Name = name.toLowerCase();
		// System.out.println(Name);
		String ch = " ";
		for (int i = 0; i < Name.length(); i++) {
			if(i%2!=0) {
				char x = (char) (Name.charAt(i)-32);
				ch=ch+x;
			}
			else {
				ch=ch+Name.charAt(i);
			}
//			ch = "" + Name.charAt(i);
//			if (i%2==0) {ihgf
//				ch.toUpperCase();
//			}
		}
		System.out.println("********");
		System.out.println(ch);
	}

}
