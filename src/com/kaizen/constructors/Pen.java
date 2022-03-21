package com.kaizen.constructors;

public class Pen {
	String manufacturer ;
	String Inccolour;
	int Price;

	public Pen() {
		
	}
	public Pen (String manufacturer,String Inccolour,int Price) {
	this.manufacturer = manufacturer;
	this.Inccolour = Inccolour;
	this.Price = Price;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen pen = new Pen();
		pen.manufacturer = "Cello";
		pen.Inccolour ="Blue";
		pen.Price = 5;
		pen.Peninfo();
		
		Pen sinosoftek = new Pen("Sinosoftek", "Black", 2);
		sinosoftek.Peninfo();
		

	}
	public void Peninfo() {
		System.out.println("Pen [manufacturer=" + manufacturer + ", Inccolour=" + Inccolour + ", Price=" + Price + "]");
	}
	
}
