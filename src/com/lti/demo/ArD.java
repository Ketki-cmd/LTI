package com.lti.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArD 
{
	static Set<Integer> countSet= new HashSet<Integer>();
    public static int solution(int A, int B, int C, int D) {
        int arr[] = {A,B,C,D};
        permuteHelper(arr,0);
        return countSet.size();
    }
    public static void permuteHelper(int[] arr, int index){
	    if(index >= arr.length - 1){ 
	    	
	    	int factor = 0;
	        int result = 0;
	       
	    	
	    	if(arr[0] <= 2 && (arr[0] != 2 || arr[1] <= 3) && arr[2] <= 5) {
	    		 for (int i = 0; i < arr.length; i++) {
	 	            result = arr[i] + factor * 10;
	 	            factor = result;
	 	        }
	 	    	if(!countSet.contains(result)) {
	 	    		countSet.add(result);
	 	    	}
	    	}

	    	 
	         return;
	    }
	   

	    for(int i = index; i < arr.length; i++){ 
	        int t = arr[index];
	        arr[index] = arr[i];
	        arr[i] = t;
	        permuteHelper(arr, index+1);
	        t = arr[index];
	        arr[index] = arr[i];
	        arr[i] = t;
	    }
	}
	
	public static void main(String args[])
	{
		
			System.out.println(solution(1,8,2,3));
		
		
	}
}
