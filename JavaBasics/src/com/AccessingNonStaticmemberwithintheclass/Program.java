package com.AccessingNonStaticmemberwithintheclass;

public class Program 
{
	boolean res=false;
	public void disp()
	{
		System.out.println("executing disp method");
	}
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		System.out.println("res="+new Program().res);
		new Program().disp();
		System.out.println("main method ended");
	}

}
