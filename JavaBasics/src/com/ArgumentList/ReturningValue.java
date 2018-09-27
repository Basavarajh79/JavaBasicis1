package com.ArgumentList;

public class ReturningValue 
{
	public static boolean disp(int a,char ch)
	{
		System.out.println("a="+a);
		System.out.println("ch="+ch);
		boolean values=true;
		return values;
	}
	public static void main(String[] args) 
	{
		System.out.println("main method started");
		boolean b=disp(14,'a');
        System.out.println("b="+b);
		System.out.println("main method ended");
	}

}
