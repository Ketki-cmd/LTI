package com.lti.demo;

public class Dominator 
{
	public static int solution(int [] A)
	{

	    int num=0,counter=0;
	    for(int i=0; i<A.length; i++)
	    {

	        if(counter == 0) 
	        	{
	        	num = i;
	        	}
	        if(A[i] == A[num])
	        {
	            counter++;
	        }
	        else 
	        {
	            counter--;
	        }
	    }
	    counter = 0;
	    for(int i=0; i<A.length; i++)
	    {
	        if(A[i] == A[num]) 
	        	{counter++;}
	    }
	    return counter>A.length/2 ? num : -1;
		
	}
	
	public static void main(String args[])
	{
		int H[]= {3,4,3,2,3,-1,3,3};
		System.out.println(solution(H));
	}
}
