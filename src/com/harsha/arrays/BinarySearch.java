package com.harsha.arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		//Declaring Array should be sorted order
		int arr[]= {1,2,3,4,5,6,7} ;
		Boolean flag=false;
		int key=10;
		int lower=0;
		
		int higher=arr.length-1;
		
		while(lower<=higher) {
			int mid=(lower+higher)/2;
			if(arr[mid]==key) {
				System.out.println("Element found");
				flag = true;
				break;
			}
			if(arr[mid]<key) {
				lower=mid+1;
			}
			if(arr[mid]>key) {
				higher=mid-1;
			}
		}
		if(flag ==false) {
			System.out.println("Element not Found");
		}
		
		
		
		
	}

}
