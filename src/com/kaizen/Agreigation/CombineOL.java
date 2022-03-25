package com.kaizen.Agreigation;

public class CombineOL {
	SumOL sum;
	SubOL sub;
	MulOL mul;
	DivOL div;
	
	public int sum () {
		sum = new SumOL();
		int d= sum.sum(41, 45);
		//System.out.println(d);
		return d;
	}
	public void sub() {
		sub = new SubOL();
		int s = sub.sub(15, 21);
		System.out.println(s);
	}
	public void Mul() {
	mul = new MulOL();
	int m = mul.mul(12, 123);
	System.out.println(m);
	}
	public void div() {
		div = new DivOL();
		float d = div.div(34, 12);
		System.out.println(d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CombineOL obj = new CombineOL();
		obj.sum();
		obj.sub();
		obj.Mul();
		obj.div();

	}

}
