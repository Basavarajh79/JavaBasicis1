package com.Looping;

public class Looping1 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		int num=12345;
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
		System.out.println("main method ended");
	}

}
