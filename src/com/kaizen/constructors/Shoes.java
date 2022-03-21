package com.kaizen.constructors;

public class Shoes {
	String Brand;
	int Size;
	String Colour;
	String Type;
	
	public Shoes() {
		
	}
	public Shoes(String Brand, int Size, String Colour,String Type) {
		this.Brand = Brand;
		this.Size = Size;
		this.Colour = Colour;
		this.Type = Type;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shoes Nike = new Shoes();
		Nike.Brand = "Nike";
		Nike.Size = 8;
		Nike.Colour = "Grey & White";
		Nike.Type = "Sports";
		Nike.Shoeinfo();
		
	}
	
	public void Shoeinfo() {
		System.out.println("Shoes [Brand=" + Brand + ", Size=" + Size + ", Colour=" + Colour + ", Type=" + Type + "]");
	}
}
