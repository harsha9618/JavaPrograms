package com.harsha.arrays;

public class BinarySearchSortingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 1, 2, 8, 88, 74, 4, 5, 6, 7 };
		int Find = 88;
		BinarySearchSortingMethod bs = new BinarySearchSortingMethod();
		bs.Sort(array);
		boolean res = bs.binarySerching(array, Find);
		System.out.println();

		if (res == true) {
			System.out.println("Does  exists");
		} else {
			System.out.println("Does not  exists");
		}
	}

	public void Sort(int[] array) {
		int n = array.length;
		int tem = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (array[j] > array[j + 1]) {
					// Swapping tempt and arr[i]
					int temp = array[j];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public boolean binarySerching(int[] array, int Find) {

		Boolean flag = false;
		// Find=88;
		int lower = 0;
		// int[] array1=null;
		int higher = array.length - 1;

		while (lower <= higher) {
			int mid = (lower + higher) / 2;
			int key = array[mid];
			if (Find == key) {
				flag = true;
				break;
			}
			if (Find < key) {
				lower = mid + 1;
			}
			if (Find > key) {
				higher = mid - 1;
			}
		}
		return flag;

	}

}
