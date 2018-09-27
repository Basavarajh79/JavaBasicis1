package com.CollectionStringClass;

public class Program2 
{
	public static void main(String[] args) 
	{
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.hashCode());
		sb=sb.append("java");
		System.out.println(sb.hashCode());
		
	}

}
