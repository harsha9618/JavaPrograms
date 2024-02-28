package com.harsha.arrays;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num = 6;
		int count = 0;

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("Prime Number");
			} else {
				System.out.println("Not aa Prime Number");
			}
		}

		/*
		 * else { System.out.println("Not a prime number"); }
		 */

	}

}
