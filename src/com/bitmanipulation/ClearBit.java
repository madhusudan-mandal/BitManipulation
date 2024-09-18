package com.bitmanipulation;

// Clear bit at position ith in a number n, means making it zero
public class ClearBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		int i=2;
		int bitMask = 1<<(i-1);
		int result= ~bitMask & n;
		System.out.println("Result: "+result);
	}

}
