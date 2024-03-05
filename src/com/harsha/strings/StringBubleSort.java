package com.harsha.strings;

public class StringBubleSort {
public static void main(String[] args) {
	String[] arr= {"harsha","dinesh","reddy","AAA"};
	bubleSort(arr);
	// Printing the sorted array
    System.out.println("Sorted array:");
    for (String s : arr) {
        System.out.println(s);
    }
}

private static void bubleSort(String[] arr) {
	
	// TODO Auto-generated method stub
	
	int a=arr.length;
	for(int i=0;i<a-1;i++) {
		for(int j=0;j<a-1;j++) {
			if(arr[i].compareTo(arr[j+1])>0) {
				String temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
			}
		}
	}
}
}
