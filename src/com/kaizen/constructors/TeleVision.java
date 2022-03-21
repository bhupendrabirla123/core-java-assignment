package com.kaizen.constructors;

public class TeleVision {
	String Brand;
	String Size;
	String Type;
	public TeleVision() {
		
	}
	public TeleVision(String Brand, String Size, String Type) {
		this.Brand = Brand;
		this.Size = Size;
		this.Type = Type;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeleVision TV = new TeleVision();
		TV.Brand = "LG";
		TV.Size = "32 inch";
		TV.Type = "Colour";
		TV.describeTeleVision();
	}
	public void describeTeleVision() {
		System.out.println("TeleVision [Brand=" + Brand + ", Size=" + Size + ", Type=" + Type + "]");
	}
}
