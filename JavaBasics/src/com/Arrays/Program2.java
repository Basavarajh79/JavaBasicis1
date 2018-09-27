package com.Arrays;

public class Program2 
{
	public static void main(String[] args) 
	{
		int[] ar= {34,8,95,1};
		System.out.println(ar.length);
        for(int i=0;i<ar.length;i++)
        {
        	System.out.println(ar[i]);
        }
		for(int z:ar)
		{
			System.out.println(z);
		}
	}

}
