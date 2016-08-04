package com.quantum.algorithm.bitoperation;

public class GrayBinaryConveration {
	
	
	public static int binaryToGray(int number){
		System.out.println("binary "+Integer.toBinaryString(number));
		int gray=number^(number>>1);
		System.out.println("gray "+Integer.toBinaryString(gray));
		return gray;
	}
	
	public static int grayToBinary(int number){
		System.out.println("gray "+Integer.toBinaryString(number));
		
		 for (int mask = number >> 1; mask != 0; mask = mask >> 1)
		    {
		        number = number ^ mask;
		    }
		int binary=number;
		System.out.println("binary "+Integer.toBinaryString(binary));
		return binary;
	}
	
   public static void main(String[] args) {
	System.out.println(binaryToGray(48));
	System.out.println(grayToBinary(40));
}

}
