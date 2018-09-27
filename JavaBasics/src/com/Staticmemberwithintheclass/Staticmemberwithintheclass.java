package com.Staticmemberwithintheclass;

public class Staticmemberwithintheclass 
{ 
		static int a=456;
		public static void test()
		{
			System.out.println("executing test method");
		}
		public static void main(String[] args) 
		{
			System.out.println("main method started");
			test();
			System.out.println("a="+a);
			System.out.println("main method ended");
		}

}
