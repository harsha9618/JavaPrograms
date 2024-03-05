package com.harsha.strings;

public class ImmutableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Hello";
        String str2 = str1; // Reference to the same object

        System.out.println("Original String: " + str1);
        System.out.println(str1.hashCode());
        System.out.println("Reference String: " + str2);
        System.out.println(str2.hashCode());
        // Modify str1
        str1 = str1.concat(" World");

        System.out.println("Modified String: " + str1);
        System.out.println(str1.hashCode());
        System.out.println("Reference String: " + str2);
        System.out.println(str2.hashCode());

	}

}
