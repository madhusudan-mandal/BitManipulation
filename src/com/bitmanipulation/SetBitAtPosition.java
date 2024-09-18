package com.bitmanipulation;

public class SetBitAtPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int i=3;
		
		int bitMask = 1<<(i-1);
		
		int result = bitMask|n;
		System.out.println("result: "+result);
	}

}
