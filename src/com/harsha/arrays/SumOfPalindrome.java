package com.harsha.arrays;

public class SumOfPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Palindromme sum
		int pair[] = { 29, 45, 24, 16, 31, 26, 3, 34, 6, 3, 12, 14, 27, 49, 3, 25, 40, 4, 2, 32 };
		//int palindromePair = 0;
		int r;
		int[] temp;
		temp = pair;
		
		
		for (int i = 0; i < pair.length; i++) {
			for (int j = 1; j < pair.length; j++) {
				int sum = pair[i] + pair[j];

				while (sum > 0) {
					r = sum % 10;
					sum = (sum * 10) + r;

				}
				if(temp==pair) {
					
					System.out.println("palindrome");
					 System.out.println("Prime of PAir "+pair[i]+","+pair[i]);
					//palindromePair++;
					
				}else {
					System.out.println("Not a Palindrome");
				}

			}
			System.out.println("Palindrome");

		}

	}
}
