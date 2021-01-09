package com.lti.demo;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PermMissingElem
{
	public static int solution(int[] arr)
	{ 	
		Set s = new HashSet();
		for(int i=0;i<arr.length;i++)
			{
		      s.add(arr[i]);
			}
		for(int i=1;i<arr.length+1;i++)
		    {
		      if(!s.contains(i)) 
		      	{
		        return 0;
		      	}
		    }
		return 1;
	}
		  
		  public static void main(String args[])
		  {
			  int a[]=new int[] {1,2,3,4,6,5,7};
			  System.out.println(solution(a));
		  }
}

import java.util.HashSet;
import java.util.Set;

Sir m getting only 93% in codility with this code not getting what is the problem
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
public static int solution(int [] A)
{
	if(A.length<3)
	{
	return 0;
	}
	Arrays.sort(A);
	for(int i=0;i<A.length-2;i++)
	{
	if((A[i]+A[i+1]>A[i+2])&&(A[i+1]+A[i+2]>A[i])&&(A[i+2]+A[i]>A[i+1]))
	{
		return 1;
	}
	}
	return 0;
}

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set s = new HashSet();
		for(int i=0;i<A.length;i++)
			{
		      s.add(A[i]);
			}
		for(int i=1;i<A.length+1;i++)
		    {
		      if(!s.contains(i)) 
		      	{
		        return 0;
		      	}
		    }
		return 1;
    }
}