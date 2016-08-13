package com.quantum.algorithm.dp;

import java.util.Arrays;

public class MaximumProfitOnStock {



	    public static int maxProfit(int price[], int n)
	    {
	        
	        int profit[] = new int[n];
	        for (int i=0; i<n; i++)
	            profit[i] = 0;
	      
	      
	        int max_price = price[n-1];
	        for (int i=n-2;i>=0;i--)
	        {	            
	            if (price[i] > max_price)
	                max_price = price[i];
	            profit[i] = Math.max(profit[i+1], max_price-price[i]);
	        }
	        System.out.println(Arrays.toString(profit));
	      
	        int min_price = price[0];
	        for (int i=1; i<n; i++)
	        {
	            if (price[i] < min_price)
	                min_price = price[i];
	      
	            // Maximum profit is maximum of:
	            // a) previous maximum, i.e., profit[i-1]
	            // b) (Buy, Sell) at (min_price, price[i]) and add
	            //    profit of other trans. stored in profit[i]

	            profit[i] = Math.max(profit[i-1], profit[i] +
	                                        (price[i]-min_price) );
	           
	        }
	        System.out.println(Arrays.toString(profit));
	        int result = profit[n-1];
	        return result;
	    }
	 
	 
	    public static void main(String args[])
	    {
	        int price[] = {2, 30, 15, 10, 8, 25, 80};
	        int n = price.length;
	        System.out.println("Maximum Profit = "+ maxProfit(price, n));
	    }
	 
	
}
