package com.kaizen.eceptionhandlig;


public class Test{
	public static void main(String[] args) {
		int a = 20;
		int  b = 30;
		int c = 10;
		Test1 obj = new Test1();
		obj.main(null);
		
		// System.out.println(a*b/(a-b+c));
		// here the Exception will be ArithmeticException: /by zero
	}
}

 class Test1 {
	
	
	public static void main(String[] args) {
		int [] arr = new int[4];
		System.out.println(arr[5]);
		// here the Exceptions thrown will be arrayoutofboundsException
	}
}



