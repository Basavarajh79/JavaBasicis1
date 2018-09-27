package com.AccessingNonStaticmemberoutsidetheclass;

public class MainClass3 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		Program2 ref=new Program2();
		System.out.println("b="+ref.b);
		System.out.println("a="+Program2.a);
		ref.test();
		Program2.disp();
		ref.b=14.3;
		System.out.println("b="+ref.b);
		Program2.a=20;
		System.out.println("a="+Program2.a);
		System.out.println("main method ended");
	}

}
