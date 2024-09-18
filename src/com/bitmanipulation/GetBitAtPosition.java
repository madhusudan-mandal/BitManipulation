package com.bitmanipulation;

public class GetBitAtPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;	//0101 in binary form
		int i = 2;	//ith position means i-1 index
		int bitMask = 1<<(i-1);
		
		if((bitMask & n) == 0)
			System.out.println("Bit at postion " + i + " is 0");
		else
			System.out.println("Bit at postion " + i + " is 1");
	}

}
