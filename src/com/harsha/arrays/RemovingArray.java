package com.harsha.arrays;

public class RemovingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b_new = new int[a.length - 1];
		int j = 0;

		for (int i = 0; i <= a.length-1; i++) {
			if (a[i] == 3) {
				continue;

			}
			b_new[j++] = a[i];
		}

		
		for(int i=0;i<b_new.length;i++) {
			System.out.println(b_new[i]);
		}

	}

}
