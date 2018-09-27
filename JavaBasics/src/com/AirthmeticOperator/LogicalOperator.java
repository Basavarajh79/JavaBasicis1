package com.AirthmeticOperator;

public class LogicalOperator 
{public static void main(String[] args) 
{
	System.out.println("main method started");
	int num1=12;
	int num2=5;
	int num3=20;
	System.out.println("res="+(num1>num2&&num1>num3));
	System.out.println("res="+(num1>num2||num1>num3));
	boolean res1=false;
	boolean res2=true;
	System.out.println(!res1);
	System.out.println(!res2);
}

}
