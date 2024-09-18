package com.bitmanipulation;

public class DecimalToBinaryByUsingBitwiseOperator {

	public static void main(String[] args) {
		int decimal =1025;
		int temp=decimal;
		int bits=0;
		while(temp!=0)
		{
			temp=temp/2;
			bits++;
		}
		
		for(int i=bits; i>=0;i--)
		{
			int bitMask = decimal>>i;
			if((bitMask & 1) ==0)
				System.out.print("0");
			else
				System.out.print("1");
		}
	}

}
