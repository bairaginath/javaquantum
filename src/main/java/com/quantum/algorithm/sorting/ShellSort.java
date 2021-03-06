package com.quantum.algorithm.sorting;

import java.util.Arrays;

public class ShellSort{
	 
	  public static void shellSort(int[] array) {
	    int inner, outer;
	    int temp;
	 
	    int h = 1;
	    while (h <= array.length / 3) {
	      h = h * 3 + 1;
	    }
	    
	    while (h > 0) {
	      for (outer = h; outer < array.length; outer++) {
	        temp = array[outer];
	        inner = outer;
	 
	        while (inner > h - 1 && array[inner - h] >= temp) {
	          array[inner] = array[inner - h];
	          inner -= h;
	        }
	        array[inner] = temp;
	      }
	      h = (h - 1) / 3;
	    }
	  }
	 
	  public static void main(String[] args) {
	 
		  int A[]={5,3,7,2,9,6,1,4,10,8,0,11};
	    System.out.println("Before: " + Arrays.toString(A));
	    shellSort(A);
	    System.out.println("After:  " + Arrays.toString(A));
	 
	  }
	}
	 