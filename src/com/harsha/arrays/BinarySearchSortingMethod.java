package com.harsha.arrays;

public class BinarySearchSortingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = { "a","z","r","g" };
		String target = "g";
		BinarySearchSortingMethod bs = new BinarySearchSortingMethod();
		bs.equals(target);
		// String target = "abcde"; // String to search for
	        int binaryResult = binarySerching(array, target);
	        if (binaryResult != -1) {
	            System.out.println("Binary Search: String found at index " + binaryResult);
	        } else {
	            System.out.println("Binary Search: String not found");
	        }
	}

	public void Sort(int[] array) {
		int n = array.length;
		//int tem = 0;
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

	public static int binarySerching(String[] array, String target) {
		//This is binaray search
		Boolean flag = false;
		// Find=88;
		int lower = 0;
		// int[] array1=null;
		int higher = array.length - 1;

		while (lower <= higher) {
			int mid = (lower + higher) / 2;
			int key = array[mid].compareTo(target);
			if (key == 0) {
				return mid;
				
				
			}
			else if (key <0) {
				lower = mid + 1;
			}
			else  {
				higher = mid - 1;
			}
		}
		return -1;

	}

}
