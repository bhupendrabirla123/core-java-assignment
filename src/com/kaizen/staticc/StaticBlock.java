package com.kaizen.staticc;

public class StaticBlock {
	static int RollNo;
	static String Name;
	String Centre;
	static int count = 0;
	
	static {
		Name = "Bhupendra Birla";
		RollNo = 23;
	}
	// constructor
	public StaticBlock(String Centre) {
		this.Centre = Centre;
	}
	// non static method
	public void display() {
		System.out.println(Centre);
		count++;
	}
	// static method
	public static void print() {
		System.out.println(Name);
		System.out.println(RollNo);
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlock obj = new StaticBlock("MIT");
		StaticBlock obj1 = new StaticBlock("SGSITS");
		
		StaticBlock.print();
		obj.display();
		System.out.println("******");
		obj1.display();
	}

}
