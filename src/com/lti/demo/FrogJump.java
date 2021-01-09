package com.lti.demo;

public class FrogJump 
{
public static int solution(int x,int y,int d)
{
    int jump=(y-x)/d;
    if((y-x)/d!=0)
    {
      jump++; 
    }
    return jump;
  
}

public static void main(String args[])
{
	System.out.println("jumps required:"+solution(10,85,30));
	}
}
