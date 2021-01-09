package com.lti.demo;

import java.util.HashSet;
import java.util.Set;

public class Missing 
{
	public static int solution(int[] arr)
	{ 	int value=1;
		Set s = new HashSet();
		for(int i=0;i<arr.length;i++)
			{
			if(arr[i]>0)
			{
		      s.add(arr[i]);
			}
			}
		while(s.contains(value)) 
		      	{
		        value++;
		      	}
		return value;
	}

		  
		  public static void main(String args[])
		  {
			  int a[]=new int[] {1,2,3,6,5,1,3,4};
			  System.out.println("Missing no:"+solution(a));
		  }
}
