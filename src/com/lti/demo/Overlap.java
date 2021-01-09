package com.lti.demo;

public class Overlap 
{
	public static int solution(int[] A, int[] B) 
	{
        int ans = 0, pre = -1;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > pre) {
                ans++;
                pre = B[i];
            }
        }
        return ans;
	}
	
	public static void main(String args[])
	{
		int A[]= {1,3,7,9,9};
		int B[]= {5,6,8,9,10};
		System.out.println(solution(A,B));
	}
}
