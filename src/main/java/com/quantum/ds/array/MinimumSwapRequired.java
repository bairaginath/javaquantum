package com.quantum.ds.array;

import java.util.Arrays;

public class MinimumSwapRequired {
	
	void updateindex(int index[], int a, int ai, int b, int bi)
	{
		index[a] = ai;
		index[b] = bi;
	}
	
	public void swap(int arr[],int x,int y){
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}

	int minSwapsUtil(int arr[], int pairs[], int index[], int i, int n)
	{
		if (i > n) return 0;
		if (pairs[arr[i]] == arr[i+1])
			return minSwapsUtil(arr, pairs, index, i+2, n);

		int one = arr[i+1];
		int indextwo = i+1;
		int indexone = index[pairs[arr[i]]];
		int two = arr[index[pairs[arr[i]]]];
		swap(arr,i+1,indexone);
		updateindex(index, one, indexone, two, indextwo);
		int a = minSwapsUtil(arr, pairs, index, i+2, n);

		// Backtrack to previous configuration. Also restore the
		// previous indices, of one and two
		swap(arr,i+1,indexone);
		updateindex(index, one, indextwo, two, indexone);
		one = arr[i];
		indexone = index[pairs[arr[i+1]]];
		two = arr[index[pairs[arr[i+1]]]];
		indextwo = i;
		swap(arr,i,indexone);
		updateindex(index, one, indexone, two, indextwo);
		int b = minSwapsUtil(arr, pairs, index, i+2, n);

		swap(arr,i,indexone);
		updateindex(index, one, indextwo, two, indexone);
		return 1 + Math.min(a, b);
	}

	int minSwaps(int n, int pairs[], int arr[])
	{
		int index[]=new int[2*n + 1]; 
		for (int i = 1; i <= 2*n; i++)
		{
			index[arr[i]] = i;
		}
		
		return minSwapsUtil(arr, pairs, index, 1, 2*n);
	}	
	
	public static void main(String[] args) {
		MinimumSwapRequired minimumSwapRequired=new MinimumSwapRequired();
		int arr[] = {0, 3, 5, 6, 4, 1, 2};
		int pairs[] = {0, 3, 6, 1, 5, 4, 2};
		int m = arr.length;
		int n = m/2; 
		System.out.println(minimumSwapRequired.minSwaps(n, pairs, arr));
	}

}
