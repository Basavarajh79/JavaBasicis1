package com.CollectionStringClass;

public class MainClass1 
{
	public static void main(String[] args) 
	{
		String s1="java";
		String s2=new String("java");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		String s3="java";
		System.out.println(s3==s1);
		String s4=new String("java");
		System.out.println(s2==s4);
	}


}
