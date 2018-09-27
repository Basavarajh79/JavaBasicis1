package com.CollectionStringClass;

public class MainClass2 
{
	public static void main(String[] args) 
	{
		String s1="java";
		String s2="sql";
		String s3=s1+s2;
		System.out.println(s3);
		String s4=new String(s1);
		String s5=new String("java");
		String s6=s1+s5;
		String s7="javasql";
		System.out.println(s3==s7);
		System.out.println(s3.equals(s7));
		System.out.println(s4==s5);
		System.out.println(s4.equals(s5));
		System.out.println(s1+s5);
		System.out.println(s6);
		
	}

}
