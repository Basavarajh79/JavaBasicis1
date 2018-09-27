package com.ClassTypeCasting;

public class MainProgram 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		Program1 ref=new Program1();
		ref.Demo(new Sample1());
		ref.Demo(new Sample2());
		ref.Demo(new Sample3());
		//ref.Demo1(new Sample1());
		ref.Demo1(new Sample2());
		ref.Demo1(new Sample3());
		//ref.Demo2(new Sample1());
		//ref.Demo2(new Sample2());
		ref.Demo2(new Sample3());
		System.out.println("main method ended");
	}

}
