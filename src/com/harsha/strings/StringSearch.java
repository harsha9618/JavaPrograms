package com.harsha.strings;

public class StringSearch {
	public boolean sequancielSearch(String[] arr,String search) {
		for (int i = 0; i <=arr.length -1; i++) {
			if (arr[i].equalsIgnoreCase(search)) {
				System.out.println("The element found At Index value of " + i);
				
			}

		}
		return true;

	}

	public static void main(String[] args) {
		String[] arr = { "harsha", "viswa", "Bhuvanesh", "Dheeraj","Reddy" };
		StringSearch ss = new StringSearch();
		boolean res = ss.sequancielSearch(arr,"reddy");

		if (res == true) {
			System.out.println("Elment Found ");

		} else {
			System.out.println("Element not found");
		}
	}

}
