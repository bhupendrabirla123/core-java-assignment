package com.kaizen.day6assignment;

import java.util.Date;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		int hours = date.getHours();
		int mins = date.getMinutes();
		
		
		System.out.printf("total mins: " + (hours*60+mins) , date);

	}

}
