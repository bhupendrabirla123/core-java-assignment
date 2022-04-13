package com.kaizen.staticc;

public class Hospital {
	static enum status{registered, verified, certified};
	
	status r = status.registered;
	status v = status.verified;
	status c = status.certified;
	
	public static void main(String[] args) {
		Hospital H = new Hospital();
		System.out.println(H.r);
	}
		
		
			
		

}
