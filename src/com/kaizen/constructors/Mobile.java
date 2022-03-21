package com.kaizen.constructors;

public class Mobile {
	String Brand; 
	String Model;
	String Colour;
	String Ram;
	String Rom;
	String Processor;
	String Androidversion;
	String Camera;
	
	public Mobile() {
		
	}
	public Mobile(String Brand, String Model, String Colour, String Ram, String Rom, String Processor, String Androidversion, String Camera ) {
		this.Brand = Brand;
		this.Model = Model;
		this.Colour = Colour;
		this.Ram = Ram;
		this.Rom = Rom;
		this.Processor = Processor;
		this.Camera = Camera;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile Vivo = new Mobile();
		Vivo.Brand = "VIVO";
		Vivo.Model = "Y19";
		Vivo.Colour ="Red";
		Vivo.Ram ="4GB";
		Vivo.Rom = "64GB";
		Vivo.Processor = "Snapdragon";
		Vivo.Androidversion = "11";
		Vivo.Camera = "48MP";
		Vivo.Mobileinfo();
	}
	public void Mobileinfo() {
		System.out.println("Mobile [Brand=" + Brand + ", Model=" + Model + ", Colour=" + Colour + ", Ram=" + Ram + ", Rom=" + Rom
				+ ", Processor=" + Processor + ", Androidversion=" + Androidversion + ", Camera=" + Camera + "]");
	}
}
