package com.harsha.arrays;

public class PrimeNumbers {
	public static void main(String[] args) {
	int  prime[] = {5,12,18,23,17,45,93,62,7,54,2};
	int i=0;
	System.out.println(prime[i]);
	}
	void primeNumbers(int[] prime) {

		int i, j, c = 0;

		for (i = 0; i < prime.length; i++) {
			c = 0;
			for (j = 1; j < prime[i]; j++) {

				if (prime[i] % j == 0) {
					c++;
				}
			}

			if (c == 2) {

				//System.out.println(prime[i] + "  ");
		}

	

}
}}
