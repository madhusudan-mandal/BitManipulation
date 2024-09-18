package com.bitmanipulation;

public class BinaryToHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String binary = "010111";
		
		// First convert it to Decimal
		Long decimal = BinaryToDecimal.binaryToDecimal(binary);
		
		// Convert decimal to hexadecimal by dividing the decimal by 16 until decimal is not zero
		// save the reminder in array
		int[] reminder= new int[(int)(decimal/16) +1];
		int i=0;
		while(decimal!=0)
		{
			reminder[i++]=(int)(decimal/16);
			decimal /= 16;
		}
		for(int j=i-1;j>=0;j--)
		{
			
		}
	}

}
