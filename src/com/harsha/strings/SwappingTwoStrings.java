package com.harsha.strings;

public class SwappingTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="India";
		String b="France";
		System.out.println("Before Swap A and B: " + a + ", " + b);
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("After swap a : " + a);
		System.out.println("After swap b : " +b);

	}

}
