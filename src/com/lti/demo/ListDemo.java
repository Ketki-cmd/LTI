package com.lti.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ListDemo {

	public static void main(String args[])
	{
		List arr=new ArrayList();
		String fruits="apple,lichi,lemon,banana,apple,plums,lemon";
		StringTokenizer stz=new StringTokenizer(fruits,",");
		
		while(stz.hasMoreTokens())
		{
			String s1=stz.nextToken();
			if(!(arr.contains(s1)))
			{
				arr.add(s1);
			}
		}
			System.out.println(arr);
	}
}
