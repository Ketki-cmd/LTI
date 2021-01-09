package com.lti.demo;
import java.util.*;
public class Stonewall 
{
	public static int solution(int[] H) {
        int len = H.length;
        Stack<Integer> stack = new Stack<Integer>();
        int Counter = 0;
        for (int i=0;i<len;i++) 
        {
            if (stack.isEmpty()) 
            {
                stack.push(H[i]);
                Counter++;
            } 
            else 
            {
                while (!stack.isEmpty() && stack.peek() > H[i])
                {
                    stack.pop();
                } 
                if (!stack.isEmpty() && stack.peek() == H[i]) 
                {
                   continue;
                }
                else 
                {
                    stack.push(H[i]);
                   Counter++;
                }
            }
        }

        return Counter;
    }
	
	public static void main(String args[])
	{
		int H[]= {8,8,5,7,9,8,7,4,8};
		System.out.println(solution(H));
	}

}
