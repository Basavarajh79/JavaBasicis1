package com.StaticAndNonStaticDatamembers;

public class MainClass1 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
	    Program1 ref=new Program1();
	    System.out.println("a="+ref.a);
	    ref.a=456;
	    System.out.println("a="+ref.a);
	    ref=new Program1();
	    System.out.println("a="+ref.a);
	    ref=null;
	    //System.out.println("a="+ref.a);
	    System.out.println("main method ended");
    }

}
