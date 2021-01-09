package com.lti.demo;

//import java.util.Set;
import java.util.ArrayList;
//import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class SetDemo {
	
	public String removeDups(String fruits)
	{
		List arr=new ArrayList();
		StringTokenizer stz=new StringTokenizer(fruits,",");
		while(stz.hasMoreTokens())
		{
			String s1=stz.nextToken();
			if(!(arr.contains(s1)))
			{
				arr.add(s1);
			}
		}
		String str=arr+",";
		return str;
		
		
	}
public static void main(String args[])
{
	String fruits="apple,lichi,lemon,banana,apple,plums,lemon";
	
		System.out.println(new SetDemo().removeDups(fruits));
}
	
}

