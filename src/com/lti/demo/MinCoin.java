package com.lti.demo;

import java.util.Arrays;

public class MinCoin
{

static int solution(int[] coins,  int amount){
    int[] dp=new int[amount+1];
    Arrays.fill(dp,amount+1);
    dp[0]=0;
    for(int i=1;i<=amount;i++){
        for(int j=0;j<coins.length;j++)
        {
            if(coins[j]<=i)
                dp[i]=Math.min(dp[i],1+dp[i-coins[j]]);
        }
    }
    if(dp[amount]>amount)
        return -1;
    return dp[amount];
}
public static void main(String args[])
{
	int a[]= {5,10,20,25};
	int k=100;
	
	System.out.println(solution(a,k));
	
	
}
}
