package com.harsha.arrays;

public class CopyArray {
	

	public static void main(String[] args) {
		int [] a= {14,24,34,44,54};
		int [] b= new int[a.length];
		

		for(int i=0;i<=a.length-1;i++) {
			//b[i]=a[i];
			b=a;
			System.out.println(b[i]);
		 
		}
		
		
		
		
		
		
	}

}
