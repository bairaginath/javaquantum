package com.quantum.algorithm.bitoperation;


//http://www.geeksforgeeks.org/copy-set-bits-in-a-range/
public class CopySetBit {

	public static void copySetBits(int x, int y, int l, int r) {

		if (l < 1 || r > 32)
			return;

		// Travers in given range
		for (int i = l; i <= r; i++) {
			int mask = 1 << (i - 1);

			// If i'th bit is set in y, set i'th
			// bit in x also.
			System.out.println("Y=" + Integer.toBinaryString(y) + " Mask"
					+ Integer.toBinaryString(mask) + " Y&Mask" + (y & mask)
					+ " binary Y&Mask" + Integer.toBinaryString((y & mask)));
			if ((y & mask) != 0) {
				x = x | mask;
			}
		}
		System.out.println(x);
	}

	public static void main(String[] args) {
		int x = 10, y = 13, l = 2, r = 3;
		copySetBits(x, y, l, r);
		x = 8;
		y = 7; 
		l = 1;
		r = 2;
		copySetBits(x, y, l, r);
	}

}
