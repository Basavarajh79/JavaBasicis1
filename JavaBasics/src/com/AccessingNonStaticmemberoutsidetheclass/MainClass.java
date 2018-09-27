package com.AccessingNonStaticmemberoutsidetheclass;

public class MainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
	    System.out.println("a="+new Program().a);
	    System.out.println("a="+Program.ch);
	    Program.test();
	    new Program().disp();
	    System.out.println("main method ended");
}

}
