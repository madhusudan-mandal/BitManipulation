package com.bitmanipulation;

public class BinaryToDecimal {

	public static Long binaryToDecimal(String binary)
	{
		Long decimal=0l;
		int base=2;
		int power=0;
		for(int i=binary.length()-1;i>=0;i--)
		{
			if(binary.charAt(i)=='1')
				decimal = decimal + (long)Math.pow(base, power);
			
			power++;
		}
		return decimal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String binary = "000100";
		Long decimal = binaryToDecimal(binary);
		System.out.println(decimal);
	}

}
