package com.kaizen.arrays;

public class forloopcontinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (var i = 0; i<=10; i++) {
			if(i % 2 == 0) continue;//this skips single iterations and break, breaks the loop at the point given
			System.out.println(i);
			if (i % 2 ==1) continue;
			System.out.println(i);
			return;
		}
	}

}
