package com.ExceptionHandling;
import java.util.Scanner;
//scanner class

public class Program3 
{
	public static void main(String[] args) 
	{
	   System.out.println("main method started");
	   try
	   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the string");
	   String s1=sc.next();
	   char ch=s1.charAt(5);
	   System.out.println(ch);
	   System.out.println("enter the number");
	   int a=sc.nextInt();
	   int c=1/a;
	   System.out.println(c);
	   }
	catch(StringIndexOutOfBoundsException ref)
	   {
		System.out.println("entering airthmetic catch block");
	   }
	   catch(ArithmeticException ref1)
	   {
		   System.out.println("arithmetic block EXCEPTION Handled");
	   }
	   System.out.println("main method ended");
	   
	}

}
