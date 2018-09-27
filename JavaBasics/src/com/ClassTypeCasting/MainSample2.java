package com.ClassTypeCasting;

public class MainSample2 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		Sample3 ref3=new Sample3();
		System.out.println("a="+ref3.a);
		ref3.test();
		System.out.println("b="+ref3.b);
		ref3.start();
		System.out.println("c="+ref3.c);
		ref3.disp();
		Sample2 ref2=ref3;
		System.out.println("a="+ref2.a);
		ref2.test();
		System.out.println("b="+ref2.b);
		ref2.start();
		Sample1 ref1=ref3;
		System.out.println("a="+ref1.a);
		ref1.test();
	}

}
