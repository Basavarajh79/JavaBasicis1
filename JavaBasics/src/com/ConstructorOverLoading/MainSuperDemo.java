package com.ConstructorOverLoading;

public class MainSuperDemo 
{ 
	public static void main(String[] args) 
	{
		System.out.println("main method started");
	    SuperDemo1 s=new SuperDemo1();
	    System.out.println("a="+s.a);
	    s.test();
	    System.out.println("main method ended");
    }

}
