package com.kaizen.constructors;

public class Bike {
	String Manufacturer;
	String Model;
	String Colour;
	int CubicCapacity;
	String Norm;
	
	public Bike() {
		
	}
	public Bike (String Manufacturer, String Model,String Colour, int CubicCapacity,String Norm) {
		this.Manufacturer = Manufacturer;
		this.Model = Model;
		this.Colour = Colour;
		this.CubicCapacity = CubicCapacity;
		this.Norm = Norm;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike ISmart = new Bike();
		ISmart.Manufacturer = "Hero";
		ISmart.Model = "I-Smart";
		ISmart.Colour = "Grey & Black";
		ISmart.CubicCapacity = 125;
		ISmart.Norm = "BS V";
		ISmart.Bikeinfo();
	}
	public void Bikeinfo() {
		System.out.println("Bike [Manufacturer=" + Manufacturer + ", Model=" + Model + ", Colour=" + Colour + ", CubicCapacity="
				+ CubicCapacity + ", Norm=" + Norm + "]");
	}
}
