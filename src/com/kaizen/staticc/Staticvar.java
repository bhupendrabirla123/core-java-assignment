package com.kaizen.staticc;

public class Staticvar {
	static String name = "Bhupendra Birla";
	int rollNo;
	String college;
	String univercity;
	Staticvar(int rollNo, String college, String univercity){
		this.rollNo = rollNo;
		this.college = college;
		this.univercity = univercity;
		
	}
	// non static class 
	public void display(){
		System.out.println("Name ="+ name);
		System.out.println( "RollNo =" +rollNo);
		System.out.println("College Name ="+college);
		System.out.println("Univercity Name ="+univercity);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticvar data = new Staticvar(25,"SVCE","RGPV");
		data.display();

	}

}
