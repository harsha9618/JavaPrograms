package com.harsha.arrays;

public class AddingArrayNumbers {
	int[] arr= {12,34,54,32,4,55,76,89,34,24,22};
	
	
	
	void sumEvenNum(int []arr) {
		int even =0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2==0) {
				even=even+arr[i];
			}
			//System.out.println(even);
		}
		System.out.println("sum of Even Numbers ");
		System.out.println(even);
	}
	
	void sumOfOddNumber(int [] arr) {
		int odd=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2 != 0) {
				odd=odd+arr[i];
				
			}
			//System.out.println(odd);
		}
		System.out.println("sum of Odd Numbers");
		System.out.println(odd);
		
	}
	
	
	public static void main(String[] args) {
		AddingArrayNumbers a=new AddingArrayNumbers();
		a.sumEvenNum(a.arr);
		a.sumOfOddNumber( a.arr);
		
	}
 
}
