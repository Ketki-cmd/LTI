package com.lti.demo;

import java.util.*;  

class Vhhhh{ 
       
static int sticks_break(int stick_length, 
                        int n, int desired_length) 
{ 
  
     if (n < 1) 
        return 0; 
      
     if (stick_length < desired_length) 
        return 0; 
          
    if (stick_length % 2 == 0) 
          
    if (stick_length / 2 == desired_length)  
       return 2; 
    else if (stick_length / 2 > desired_length) 
            return (sticks_break(stick_length / 2, 
                        n - 1, desired_length)); 
               
    if (stick_length % 2 != 0) 
      
      
        if (stick_length / 2 == desired_length)  
            return 1; 
              
         
        if (stick_length / 2 + 1 == desired_length) 
            return 1; 
         
        if (stick_length/2 > desired_length) 
            return (Math.max (sticks_break( 
                               stick_length / 2, 
                               n - 1, desired_length), 
                               sticks_break( 
                               stick_length / 2 + 1,  
                               n - 1, desired_length)));  
          
    return 0; 
}  
  

static int numberOfSticks(int list_length[], 
                          int n, int desired_length) 
{ 
    int count = 0; 
      
    for(int i = 0; i < list_length.length; i++) 
    { 
          
         
        if (desired_length == list_length[i]) 
          
             
            count = count + 1; 
              
        
        else if (list_length[i]> desired_length) 
          
            count = count + sticks_break(list_length[i], 
                                   n, desired_length); 
    }  
       
    return count; 
} 
 
public static void main(String args[])  
{  
      
     
    int[] list_length = new int[]{ 1, 2, 3, 21 };  
      
    int n = 10; 
      
    
    int desired_length = 21; 
      
    int count = numberOfSticks(list_length, n, 
                            desired_length); 
                              
    System.out.println(count); 
} 
} 
  