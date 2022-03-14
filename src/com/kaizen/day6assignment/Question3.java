package com.kaizen.day6assignment;

import java.util.Date;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.printf("%tT%n", date);
		System.out.printf("Hours: %1$tH  Minutes: %1$tM   Seconds: %1$tS%n ",date);
		System.out.printf("%1$tH:%1$tM:%1$tS %1$tp %1$tL %1$tN %1$tz %n", date);
		

	}

}
