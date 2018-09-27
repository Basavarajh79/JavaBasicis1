package com.Operater;

public class Program 
{
	public static void main(String[] args) 
	{
		int a=10;
		//pre-Increment
		System.out.println("pre increment="+(++a));
		int b=5;
		int sum=a+b;
		System.out.println(b);
		System.out.println(sum);
		
		//Post-Increment
		int a1=10;
		System.out.println("post increment="+a1++);
		int b1=5;
		int sum1=(b1++)+(b1++);
		System.out.println(b1);
		System.out.println(sum1);
		
		
	}

}
