package com.lti.demo;
import java.util.*;

public class StrDemo {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
	System.out.println("enter string");
	String str=sc.next();
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(Character.isDigit(str.charAt(i)))
		{
			String tmp=str.substring(i,i+1);
			sum=sum+Integer.parseInt(tmp);
		}		
	}
	System.out.println(sum);
	}
}
