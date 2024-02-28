package com.harsha.arrays;

public class SortingArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pattran Program
		/*
		 * for(int i=0;i<=6;i++) { for(int j=0;j<=i;j++) { System.out.print("*"); }
		 * System.out.println(); }
		 */

		int[] a = { 10, 24, 5, 5, 3, 2 };

		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println("Even Number " + a[i]);
			} else {
				System.out.println("Odd Number " + a[i]);
			}
		}

	}

}
