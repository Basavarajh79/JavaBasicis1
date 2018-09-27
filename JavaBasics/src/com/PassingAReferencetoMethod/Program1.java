package com.PassingAReferencetoMethod;

public class Program1 
{
	public int test()
	{
		System.out.println("executing test method");
		return 123;
	}
	public Demo disp()
	{
		System.out.println("executnig disp method");
		Demo d1=new Demo();
		System.out.println("d1="+d1);
		//System.out.println("b="+d1.b);
		return d1;
	}
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		Program1 s1=new Program1();
		int res=s1.test();
		System.out.println("res="+res);
		Demo ref=s1.disp();
		System.out.println("ref="+ref);
	
	}

}
