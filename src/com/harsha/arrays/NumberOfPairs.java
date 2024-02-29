package com.harsha.arrays;

public class NumberOfPairs {
	// Finding the values of pairs that given sum values is even,
	// odd,prime,palindrome

	public static void main(String[] args) {
		int pair[] = { 5, 45, 24, 5, 31, 26, 3, 34, 6, 3, 12, 14, 27, 49, 3, 25, 40, 4, 2, 32 };
		// int pair[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47 };
		int evenSumPair = 0;
		int oddSumPair = 0;
		int primePair = 0;
		int palindromePair = 0;

		for (int i = 0; i < pair.length; i++) {
			for (int j = i + 2; j < pair.length; j++) {
				int sum = pair[i] + pair[j];
				if (sum % 2 == 0) {

					evenSumPair++;
					System.out.println("Pairs of Even " + pair[i] + "," + pair[j]);
				} else {
					oddSumPair++;
					System.out.println("Pairs of Odd " + pair[i] + "," + pair[j]);
				}
				/*
				 * if(isPrime(sum)) { primePair++;
				 * System.out.println("Prime of PAir "+pair[i]+","+pair[j] ); }
				 */
				 System.out.println("Even Sum Of Pairs " + evenSumPair);
				 System.out.println("Odd Sum Of Pairs " + oddSumPair);
				System.out.println("Palindrome Pair " + palindromePair);

				int a = pair[i] + pair[j];
				int tem = a;
				int pali = 0;
				while (a > 0) {
					int rem = 0;
					rem = a % 10;
					pali = (pali * 10) + rem;
					a = a / 10;

				}
				if (pali == tem) {
					System.out.println("Pairs of Palindrome : " + pair[i] + "," + pair[j] );
					System.out.println("Palindrome");
					palindromePair++;
				} else {
					System.out.println("Pairs of Palindrome : " + pair[i] + "," + pair[j] );
					System.out.println("Not a Palindrome ");
				}

				/*
				 * public int ispalindrome() { for (int i = 1; i < pair.length; i++) {
				 * 
				 * if (pair[i] % i == 0) { primePair++; //
				 * System.out.println("Prime of PAir "+pair[i]+","+pair[primePair]); } }
				 * 
				 * if (primePair == pair[primePair]) { System.out.println("Prime Number");
				 * 
				 * } else {
				 * 
				 * System.out.println("Not a prime number"); }
				 * 
				 * System.out.println("Prime number " + primePair);
				 * 
				 * }
				 * 
				 */
			}
		}
	}
}