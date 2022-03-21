package com.kaizen.constructors;

public class Watch {
	String Brand;
	String Colour;
	int Price;

	public Watch() {

	}

	public Watch(String Brand, String Colour, int Price) {
		this.Brand = Brand;
		this.Colour = Colour;
		this.Price = Price;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Watch fastrack = new Watch();
		fastrack.Brand = "Fastrack";
		fastrack.Colour = "Black";
		fastrack.Price = 1100;
		fastrack.Watchinfo();

	}

	public void Watchinfo() {
		System.out.println("Watch [Brand=" + Brand + ", Colour=" + Colour + ", Price=" + Price + "]");
	}
}
