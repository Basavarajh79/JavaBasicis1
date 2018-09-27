package com.CollectionStringClass;

public class Program 
{
	public static void main(String[] args) 
	{
		String s1="java";
		int size=s1.length();
		System.out.println(size);
		char ch=s1.charAt(1);
		System.out.println(ch);
		char []c1=s1.toCharArray();
		for(int i=0; i<c1.length; i++)
		{
			System.out.println(c1[i]);
		}
		String s2="java";
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		String s3="string";
		System.out.println(s3.substring(2));
		System.out.println(s3.substring(2, 5));
		
		String s4="java is easy";
		String[] ar=s4.split(" ");
	    for(int i=0;i<ar.length;i++)
	    {
	    	System.out.println(ar[i]);
	    }
	    System.out.println(s4.trim());
	   
		   String string = ("You are awesome honey");
	        for (int i1 = 0 ; i1<string.length() ; i1++)
	        if (string.charAt(i1) == 'o')
	        System.out.println(string.indexOf(i1));
	   }
	    
	}


