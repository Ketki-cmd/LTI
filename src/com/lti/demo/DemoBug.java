package com.lti.demo;
import java.util.Arrays;
public class DemoBug {
	 int solution(int[] A, int[] B) {
	        int n = A.length;
	        int m = B.length;
	        Arrays.sort(A);
	        Arrays.sort(B);
	        int i = 0;
	        for (int k = 0; k < n; ) {
	            if (A[k] == B[i])
	                return A[k];
	            if (i < m-1  && B[i] < A[k]) 
	                i += 1;
	        else
	        k+=1;
	        }
	        return -1;
	    }
	    
	    public static void main(String[] args) {
	        int[] A = {2,4,6,7};
	        int[] B = {2,1,5,8};
	        System.out.println(new DemoBug().solution(A, B));
	    }

}
