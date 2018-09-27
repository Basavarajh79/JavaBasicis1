package com.Abstraction;

public class MainClassProgram12 
{
	public static void main(String[] args) 
	{
		Program2 ref=new Program2();
		ref.disp();
		ref.start();
		System.out.println("b="+ref.b);
		System.out.println("a="+Program1.a);
		Program1.test();
	}

}
