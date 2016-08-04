package com.quantum.algorithm.bitoperation;

//http://www.geeksforgeeks.org/find-even-occurring-elements-array-limited-range/

public class RepeatingEven {
	
	
	public static void printRepeatingEven(int arr[])
	{
	    long  _xor = 0L;
	    long  pos;
	    int n=arr.length;
	 
	    // do for each element of array
	    for( int i = 0; i < n; ++i)
	    {
	        // right pos 1 by value of current element
	    	
	        pos = 1 << arr[i];
	        System.out.println(":i value :"+i+"::"+arr[i]+":Pos :"+Integer.toBinaryString((int)pos));
	        // Toggle the bit everytime element gets repeated
	        _xor ^= pos;
	        System.out.println("xor "+Integer.toBinaryString((int)_xor));
	    }
	 System.out.println("============================================================");
	    // Traverse array again and use _xor to find even
	    // occuring elements
	    for (int i = 0; i < n; ++i)
	    {
	        // right shift 1 by value of current element
	        pos = 1 << arr[i];
	        System.out.println(":i value :"+i+"::"+arr[i]+":Pos :"+Integer.toBinaryString((int)pos)+":Xor:"+Integer.toBinaryString((int)_xor)+"::pos & _xor::"+(pos & _xor));
	 
	        // Each 0 in _xor represents an even occurrence
	        if (0==(pos & _xor))
	        {
	            // print the even occurring numbers
	            	            System.out.println(arr[i]);
	 
	            // set bit as 1 to avoid printing duplicates
	            _xor ^= pos;
	        }
	    }
	}
	public static void main(String[] args) {
		
		printRepeatingEven(new int[]{9, 12, 23, 10, 12, 12, 15, 23,14, 12, 15});
		
	}

}
