package com.ClassTypeDownCosting;

public class MainDemo 
{
	public static void main(String[] args) 
	{ 
		System.out.println("main method started");
		Demo1 d1=new Demo3();
		System.out.println("a="+d1.a);
		if(d1 instanceof Demo2)
		{
			Demo2 d2=(Demo2)d1;
			System.out.println("a="+d2.a);
			System.out.println("b="+d2.b);
		}
		if(d1 instanceof Demo3)
		{
			Demo3 d3=(Demo3)d1;
			System.out.println("a="+d3.a);
			System.out.println("b="+d3.b);
			System.out.println("c="+d3.c);
		}
		Demo1 ref1=new Demo2();
		if(ref1 instanceof Demo3)
		{
			Demo3 ref2=(Demo3)ref1;
			System.out.println("a="+ref2.a);
			System.out.println("b="+ref2.b);
			System.out.println("c="+ref2.c);
			
		}
		else
		{
			System.out.println("properities are present in object");
		}
	}

}
