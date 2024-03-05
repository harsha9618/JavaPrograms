package com.harsha.strings;

import java.util.Scanner;

public class SwappingToNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the X value and Y value: ");
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("Before Swapping Number "+x+" "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swapping Number "+x+" "+y);
		
	}

}
