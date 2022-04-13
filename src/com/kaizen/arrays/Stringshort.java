package com.kaizen.arrays;

public class Stringshort {
	public static void main(String[] args) {
		String [] a = {"am","bhupendra","i"};
		String temp;
		for (int i = 0 ; i<a.length;i++){
			for(int j = i; j<a.length;j++) {
				if(a[i].length()>a[j].length()) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (String array :a) {
			System.out.println(array);
		}
	}

}
