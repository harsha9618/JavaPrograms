package com.harsha.strings;

import java.util.Arrays;

public class CountNoOfWordsContainsVowels {
	
	public void countVowels(String A) {
		String [] H=A.split(" ");
		int count=0;
		System.out.println(Arrays.toString(H));
		for(int i=0;i<=H.length-1;i++) {
			if (H[i].contains("a") || H[i].contains("e") || H[i].contains("i") || H[i].contains("o") || H[i].contains("u")) {
				
			}
			else {
				System.out.println();
				System.out.println(H[i]);
			}
			
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A= "why where do you last";
		CountNoOfWordsContainsVowels ib=new CountNoOfWordsContainsVowels();
		ib.countVowels(A);

	}

}
