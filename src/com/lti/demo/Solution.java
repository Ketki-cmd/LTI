package com.lti.demo;

public class Solution {
	
	    static int solution(int M, int[] A) {
	        int N = A.length;
	        int[] count = new int[M + 1];
	        for (int i = 0; i <= M; i++)
	            count[A[i]-1] = 0;
	        int maxOccurence = 1;
	        int index = -1;
	        for (int i = 0; i < N; i++) {
	            if (count[A[i]-1] >0) {
	                int tmp = count[A[i]-1];
	                if (tmp > maxOccurence) {
	                    maxOccurence = tmp;
	                    index = i;
	                }
	                count[A[i]-1] = tmp + 1;
	            } else {
	                count[A[i]-1] = 1;
	            }
	        }
	        return A[index];
	    }
	    public static void main(String args[])
		{
			int arr[]=new int[] {3,4,4,6,1,4,4};
			int x=5;
			System.out.println(solution(x,arr));
		}
		

	
	
}
