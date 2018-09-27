package com.ObjectClass;

import com.AccessingNonStaticmemberoutsidetheclass.Program2;

public class MainClassForHASHCODE 
{
	public static void main(String[] args) 
	{
		Program1 ref=new Program1();
		ProgramhashCode ref1=new ProgramhashCode();
		System.out.println("Hachcode="+ref.hashCode());
		System.out.println("HashCode="+ref1.hashCode());
		System.out.println(ref.equals(ref1));
	}

}
