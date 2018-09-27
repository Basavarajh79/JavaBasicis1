package com.StaticAndNonStaticDatamembers;

public class MainClass2 
{ public static void main(String[] args) 

 {
	System.out.println("main method ended");
	Program1 p1=new Program1();
	System.out.println("a="+p1.a);
	Program1 p2=p1;
	p2.a=456;
	System.out.println("a="+p2.a);
	Program1 p3=p1;
	System.out.println("a="+p3.a);
	System.out.println("main method ended");
 }

}
