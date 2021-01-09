package com.lti.demo;

import java.util.HashMap;
import java.util.Set;


public class Odd {

	public static int oddd(int[] A)
	{
		int elem=0;
	HashMap<Integer,Integer> arr=new HashMap<Integer,Integer>();
	   
	    for(int i=0; i<A.length; i++)
	    {
	      if(arr.containsKey(A[i])) 
	    {
	        int occ= arr.get(A[i]);
	        occ++;
	        arr.put(A[i],occ);
	      }
	      else
	      {
	    	  arr.put(A[i], 1); 
	      }
	    }
	    Set s1=arr.keySet();
	    for(int currentKey : A) 
	    {
	      int occ = arr.get(currentKey);
	   
	    if(occ % 2 != 0) 
	    {
	    	elem = currentKey;
	    }
	    }
	    
		return elem;
	    }
	
	public static void main(String args[])
	{
		
		System.out.println(oddd(new int[] {12,13,14,12,13,14,12}));
	}
}
