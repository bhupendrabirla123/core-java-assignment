package com.kaizen.constructors;

public class Fan {
	String Type;
	String Colour;
	String Brand;
	String Speed;
	public Fan() {
		
	}
	public Fan(String Type, String Colour,String Brand, String Speed) {
		this.Type = Type;
		this.Colour = Colour;
		this.Brand = Brand;
		this.Speed = Speed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan Bajaj = new Fan();
		Bajaj.Type = "Celing";
		Bajaj.Colour = "Black";
		Bajaj.Brand = "Bajaj";
		Bajaj.Speed = "1800RPM";
		Bajaj.Faninfo();
	}
	public void Faninfo() {
		System.out.println("Fan [Type=" + Type + ", Colour=" + Colour + ", Brand=" + Brand + ", Speed=" + Speed + "]");
	}
}
