package com.ConstructionOverloading;

public class MainDemo 
{  
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		Demo d=new Demo();
		d.start();
		d.start(1);
		d.start(2.2);
		d.start(1,2.2);
		d.start(2.2,1);
		System.out.println("main method ended");
    }

}
