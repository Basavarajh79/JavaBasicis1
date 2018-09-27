package com.StaticAndNonStaticDatamembers;

public class MainClass 
{ 
	public static void main(String[] args) 
	{
		System.out.println("main method started");
	    Program ref=new Program();
	    System.out.println("a="+ref.a);
	    System.out.println("s1="+ref.s1);
	    System.out.println("ch="+Program.ch);
	    System.out.println("s2="+Program.s2);
	    ref.test(1, 2);
	    System.out.println("main method ended");
    }

}
