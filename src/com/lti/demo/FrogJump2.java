package com.lti.demo;

import java.util.HashSet;
import java.util.Set;

public class FrogJump2 
{

	public static int Solution(int arr[],int x)
	{
		Set<Integer> s=new HashSet<Integer>();
		
			for(int i=0;i<arr.length;i++)
			{
				if(s.add(arr[i]))
				{
					x--;
			
				}
				if(x==0)
				{
					return i;
				}

			}
		return -1;
	}
	public static void main(String args[])
	{
		int arr[]=new int[] {1,1,1,1};
		int x=2;
		System.out.println(Solution(arr,x));
	}
}
