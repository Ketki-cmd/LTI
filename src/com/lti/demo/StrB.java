package com.lti.demo;

import java.util.*;


public class StrB 
{

	public static void main(String args[])
	{
		
		int sum=0;
		String Marks="Maths:90,English:87,Science:91";
		StringTokenizer stz= new StringTokenizer(Marks,",");
		while(stz.hasMoreTokens())
		{
			String s=stz.nextToken();
			StringTokenizer stx= new StringTokenizer(s,":");
			String s1=stx.nextToken();
			sum+=Integer.parseInt(stx.nextToken());
		}
		System.out.println("total count:"+sum);
	}
}
