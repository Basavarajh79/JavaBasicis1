package com.ArgumentList;

public class Program1 
{
	public static void disp()
	{
		System.out.println("executing zero arg method");
	}
	public static void start(char ch)
	{
		System.out.println("ch="+ch);
		System.out.println("executing char arg method");
	}
	public static void run(boolean res,int a,double b)
	{
		System.out.println("res="+res);
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("executng 3 arg method");
	}
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		disp();
		start('a');
		run(true,1,1.2);
		System.out.println("main method ended");
		
	}

}
