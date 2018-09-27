package com.ClassTypeDownCosting1;

public class MainSample 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		Sample ref=new Sample1();
		ref.test();
		System.out.println("a="+ref.a);
		Sample1 ref1=(Sample1)ref;
		ref1.test();
		System.out.println("a="+ref1.a);
		ref1.disp();
		System.out.println("b="+ref1.b);
		System.out.println("main method ended");
	}

}
