package com.lti.demo;

import java.util.Scanner;

public class StrDemo2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int maxval=0,num=0;
	System.out.println("enter string");
	String str=sc.next();
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(Character.isDigit(ch))
		{
			maxval=Character.getNumericValue(ch);
			if(maxval>num)
			num=maxval;
		}
	}
	System.out.println(maxval);
	}
}
