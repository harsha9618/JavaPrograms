package com.harsha.arrays;

public class FindLargestAndLowestNumber {
	
	public FindLargestAndLowestNumber() {
		int [] arr= {79, 4, 70, 38, 125, 38, 50, 19, 160, 192, 85, 160, 131, 198, 192, 22, 130, 122,898};
		
		int smallNumber=arr[0];
		int largeNumber=arr[0];
		
		for(int i=0;i<=arr.length-1;i++) {
//			if(arr[i]>smallNumber) {
//				smallNumber=arr[i];
//			}else if(arr[i]<largeNumber){
//				largeNumber=arr[i];
//			}
			if(arr[i]>largeNumber) {
				largeNumber=arr[i];
			}else if(arr[i]<smallNumber) {
				smallNumber=arr[i];
			}
		}
		System.out.println("Smallest number "+smallNumber);
		System.out.println("Largest Number "+largeNumber);
		
		
		
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		FindLargestAndLowestNumber sm=new FindLargestAndLowestNumber();
		
	}

}
