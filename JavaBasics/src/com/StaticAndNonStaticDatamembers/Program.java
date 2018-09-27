package com.StaticAndNonStaticDatamembers;

public class Program 
{
	int a=456;
	//primitive,non-satic,global variable
	static char ch='a';
	//primitive,satic,global variable
	String s1="java";
	//non-primitive,non-static global variable
	static String s2="testing";
	//non-primitive,static,global varibale
	public void test(int c,int d)
	{
		System.out.println("c="+c);
		System.out.println("d="+d);
		float g=4.3f;//primitive local variable
		System.out.println("g="+g);
		
	}

}
