package com.harsha.arrays;

public class ExisstingArrayOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 94, 23, 87, 50, 90, 26, 19, 3, 77, 54, 37, 93, 95, 53, 38, 78, 19 };
		int arr1 = 914;
		boolean flag = false;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == arr1) {
				flag = true;
				continue;
			}
		}
		if (flag) {
			System.out.println("Given Number Is Visuable " + arr1);
		} else {
			System.out.println("Not a existing number " + arr1);
		}

	}

}
