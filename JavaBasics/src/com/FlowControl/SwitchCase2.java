package com.FlowControl;

public class SwitchCase2 
{
	public static void main(String[] args) 
	{
		System.out.println("main method ended");
	    char a='c';
		String s1="a";
		switch(s1)
		{
		case "97":
		System.out.println("10");
		break;
		case"98":
		System.out.println("20");
		break;
		case"99":
		System.out.println("30");
		break;
		case"100":
		System.out.println("40");
		default:
		System.out.println("invalid");	
		break;
		}
		System.out.println("main method ended");
	}

}
