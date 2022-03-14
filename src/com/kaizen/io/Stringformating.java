package com.kaizen.io;

import java.util.Date;

public class Stringformating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// control +shift +o for import 
		Date date = new Date();
		// 't' for date and 'T' for time part of date
		System.out.printf("%tT%n", date);
		
		// hours, minutes and seconds
		System.out.printf("hours %tH: minutes %tM: seconds %tS%n", date, date,date);
		// index reference of the parameter $1 in this case
		System.out.printf();

		

	}

}
