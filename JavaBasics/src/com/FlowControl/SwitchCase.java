package com.FlowControl;

public class SwitchCase 
{
	private static Object case20;
	private static int case10;

	public static void main(String[] args) 
	{
		int a=30;
		System.out.println("main method started");
		switch(a)
		{
		case 10:
		System.out.println("10");
		break;
		case 20:
		System.out.println("20");
		break;
		case 30:
		System.out.println("30");
		break;
		case 40:
		System.out.println("40");
		break;
		default:
		System.out.println("invalid");
		break;
		}
		System.out.println("main method ended");
		
	}

}
