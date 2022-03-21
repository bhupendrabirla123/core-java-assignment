package com.kaizen.constructors;

public class Laptop {
	String Brand;
	int windows;
	String Processor;
	String Ram;
	String HardDisk ;
	
	
	public Laptop() {
		System.out.println("Laptop Specifications");
	}
	//parameterized constructor
	public Laptop(String Brand, int windows, String Processor, String Ram,String HardDisk) {
		System.out.println("System info");// using this for only checking is my parameterised constructor running or not
		this.Brand = Brand;
		this.Processor =Processor;
		this.Ram = Ram;
		this.windows = windows;
		this.HardDisk = HardDisk;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// non parameterised 
		Laptop hp = new Laptop();
		hp.Brand = "hp";
		hp.Processor = "i5";
		hp.Ram = "4 Gb";
		hp.HardDisk = "180 GB SSD";
		hp.windows =7;
		hp.describeLaptop();
		
		// parameterised
		Laptop Dell = new Laptop("Dell", 7,"i7", "12GB","1TB");
		Dell.describeLaptop();
		
		

	}
	public void describeLaptop() {
		System.out.println("Laptop [Brand=" + Brand + ", windows=" + windows + ", Processor=" + Processor + ", Ram=" + Ram
				+ ", HardDisk=" + HardDisk + "]");
	}
}
		
