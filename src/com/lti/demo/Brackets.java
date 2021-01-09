package com.lti.demo;
import java.util.*;
import java.util.Stack;
public class Brackets
{
	public static int solution(String S)
	{
		Stack <Character> s=new Stack<Character>();
		for(char c:S.toCharArray())
		{
		    if (c == '{' || c == '(' || c == '[')
		    {
		      s.push(c);
		    }
		    else if (c == '}' || c == ')' || c == ']')
		    {
		      s.pop();
		    }
		    else
		    {
		    	return 0;
		    }
		}
		  if (S.length() > 0)
		  {
		    return 0;
		  }
		  if(s.isEmpty())
		  {
			  return 1;
		  }
		  else 
			  {
			  return 0;
			  }
		 
		}
	public static void main(String args[])
	{
		String s="({[])";
		System.out.println(solution(s));
	}
}

