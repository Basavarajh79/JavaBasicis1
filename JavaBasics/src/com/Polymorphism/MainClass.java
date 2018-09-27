package com.Polymorphism;

public class MainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		Factory ref=new Factory();
		ref.enginemaker(new ThreeWheeler());
		ref.enginemaker(new FourWheeler());
		ref.enginemaker(new TwoWheeler());
		System.out.println("main method ended");
		
	}

}
