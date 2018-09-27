package com.PassingAReferencetoMethod;

public class Program 
{
	public void test(int a)
	{
		System.out.println("executing test method");
		System.out.println("a="+a);
	}
	public void disp(Demo d1)
	{
		System.out.println("executing disp method");
		System.out.println("d1="+d1);
		System.out.println("b="+d1.b);
		
	}
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		Program s1=new Program();
		s1.test(2);
		int d=23;
		s1.test(d);
		s1.disp(new Demo());
		Demo d2=new Demo();
		s1.disp(d2);
	}

}
