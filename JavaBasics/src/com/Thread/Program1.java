package com.Thread;

public class Program1 
{
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		Thread ref=Thread.currentThread();
		System.out.println(ref.getId());
		System.out.println(ref.getName());
		System.out.println(ref.getPriority());
		ref.setName("th");
		ref.setPriority(8);
		System.out.println(ref.getName());
		System.out.println(ref.getPriority());
		System.out.println("main method ended");
		
	}

}
