package com.harsha.strings;

public class VowelOrNot {

	public static void main(String[] args) {
		String statement = "This is a test to check for non-vowel words.";
	    String wordWithoutVowels = findWordWithoutVowels(statement);
	    
	    if (wordWithoutVowels != null) {
	      System.out.println("The word without vowels in the statement is: " + wordWithoutVowels);
	    } else {
	      System.out.println("No word in the statement is entirely without vowels.");
	    }
	}

	public static String findWordWithoutVowels(String statement) {
	    String[] words = statement.split(" "); // Split the statement into words
	    for (String word : words) {
	      if (!hasVowels(word)) {
	        return word;
	      }
	    }
	    return null;
	  }
	public static boolean hasVowels(String word) {
	    // Check if the word contains any vowel characters (a, e, i, o, u)
	    for (char c : word.toLowerCase().toCharArray()) {
	      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	        return true;
	      }
	    }
	    return false;
	  }
	

}
