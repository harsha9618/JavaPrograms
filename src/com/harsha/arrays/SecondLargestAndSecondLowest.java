package com.harsha.arrays;

import java.util.Arrays;

public class SecondLargestAndSecondLowest {
	public static void main(String[] args) {
		int arr[] = {55,32,45,98,82,11,9,39,50};
		
		int a;
		int count=arr.length;
		for(int i=0;i<count;i++) {
			for(int j=i+1;j<count;j++) {
				if(arr[i]>arr[j]) {
					a=arr[i];
					arr[i]=arr[j];
					arr[j]=a;
					
				}
			}
		}
		System.out.println("Second Lowest num " + arr[1]);
		System.out.println("First lowest numcer "+arr[0]);
		System.out.println("Second Higest Number "+arr[count-2]);
		System.out.println("First higest numcer "+arr[count-1	]);
		System.out.println(Arrays.toString(arr));
	}
	

}
