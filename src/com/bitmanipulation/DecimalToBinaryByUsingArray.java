package com.bitmanipulation;

public class DecimalToBinaryByUsingArray{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int decimal = 260;
		int temp=decimal;
		int[] reminder = new int[decimal/2 + 1];
		int i=0;
		while(decimal!=0)
		{
			reminder[i++]=decimal%2;
			decimal=decimal/2;
		}
		System.out.println("Binary of decimal number "+ temp + " is " );
		for(int j=i-1;j>=0;j--)
			System.out.print(reminder[j]);
	}

}
