package com.harsha.arrays;

public class SumOfAlternativePairs {

	public void sumOfEvenPairs(int[] arr) {
		// int length=arr.length;
		int sum = 0;
		int evenCount = 0;
		int oddCount = 0;

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 1; j <= arr.length - 1; j++) {
				sum = arr[i] + arr[j];

				if (sum % 2 == 0) {
					System.out.println("Alternative Even Numbers " + arr[i] + " " + arr[j]);
					evenCount++;
				}
			}
		}
		System.out.println("Count of Even Numbers " + evenCount);

	}
	// Sum of odd alternative pair method

	public void sumOfOddPairs(int[] arr) {
		int sum = 0;
		int oddCount = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 1; j <= arr.length - 1; j++) {
				sum = arr[i] + arr[j];
				if (sum % 2 != 0) {
					System.out.println("Alternative Odd Numbers " + arr[i] + " " + arr[j]);
					oddCount++;
				}
				j++;
			}
		}
		System.out.println("Count of Odd Numbers " + oddCount);

	}

	public void palindromeSUmPairs(int[] arr) {
		int r;

		int palindromeNum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				int sum = arr[i] + arr[j];
				int originalSum = sum;
				int reversed = 0;

				while (sum > 0) {
					r = sum % 10;
					reversed = (reversed * 10) + r;
					sum = sum / 10;

				}
				//j++;
				if (originalSum == reversed) {
					System.out.println("palindrome numberpair " + arr[i] + " " + arr[j]);
					System.out.println("Palindrome");
					palindromeNum++;
				} else {
					System.out.println("Not a Palindrome number"+arr[i]+" ,"+arr[j]);
					System.out.println("Not A Palindrome");
				}
				j++;
			}
		}
		System.out.println("Total palindrome pairs: " + palindromeNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 9 };
		SumOfAlternativePairs sm = new SumOfAlternativePairs();
		
		  sm.sumOfEvenPairs(arr); sm.sumOfOddPairs(arr);
		 

		sm.palindromeSUmPairs(arr);
	}

}
