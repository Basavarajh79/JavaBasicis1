package com.FlowControl;

public class SwitchCase1 
{public static void main(String[] args)
{
	char a='c';
	System.out.println("main method started");
	switch(a)
	{
	case 'a':
	System.out.println("10");
	break;
	case 'b':
	System.out.println("20");
	break;
	case 'c':
	System.out.println("30");
	break;
	case 'd':
	System.out.println("40");
	break;
	default:
	System.out.println("invalid");
	break;
	}
	System.out.println("main method ended");
	
}

}
