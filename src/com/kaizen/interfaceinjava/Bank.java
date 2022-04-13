package com.kaizen.interfaceinjava;

public class Bank implements InterfaceA,InterfaceB{
	
	@Override
	public void openaccount() {
		System.out.println("Enter your name");
	}

	@Override
	public void summary() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double addbal() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int withdraw() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	public static void hello() {
		System.out.println("in hello");
		
	}
	protected void in() {
		System.out.println("in in A");	
		}
}
