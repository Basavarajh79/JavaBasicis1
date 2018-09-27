package com.Inheritance;

public class MainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		Demo1 d=new Demo1();
		d.test();
		System.out.println(d.a);
		d.disp();
		System.out.println(d.b);
		System.out.println("main method ended");
	}
}