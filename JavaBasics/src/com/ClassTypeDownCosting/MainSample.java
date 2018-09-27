package com.ClassTypeDownCosting;

public class MainSample 
{ 
	public static void main(String[] args) 
	{
		System.out.println("main method started");
	    Sample ref=new Sample1();
	    System.out.println("a="+ref.a);
	    ref.test();
	    Sample1 ref2=(Sample1)ref;
	    ref2.test();
	    System.out.println("a="+ref2.a);
	    ref2.disp();
	    System.out.println("b="+ref2.b);
    }

}
