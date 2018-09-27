package com.AccessingNonStaticmemberoutsidetheclass;

public class MainClass1 
{ public static void main(String[] args) 
   
   {
	System.out.println("main method started");
	System.out.println("a="+new Program1().a);
	new Program1().run();
	new Program1().a=8.6f;
	System.out.println("a="+new Program1().a);
	System.out.println("main method ended");
   }

}
