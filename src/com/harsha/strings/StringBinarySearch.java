package com.harsha.strings;

import java.util.Arrays;

public class StringBinarySearch {

	public static void main(String[] args) {
		String[] names = { "lice", "Chet", "harlie", "David", "Son" };
		String target = "Lice";

		// Sort the array before searching
		Arrays.sort(names);

		int index = binarySearch(names, target);
		if (index != -1) {
			System.out.println("Target '" + target + "' found at index " + index);
		} else {
			System.out.println("Target '" + target + "' not found");
		}
	}

	public static int binarySearch(String[] data, String target) {
		int low = 0;
		int high = data.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			int comparison = data[mid].compareTo(target);
			if (comparison == 0) {
				return mid;
			} else if (comparison < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

}
