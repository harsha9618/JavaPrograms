package basics;

public class PalindromeStringOrNot1 {

	public static void main(String[] args) {
		String str="HEllo",reverseString="";
		int strLength=str.length();
		for(int i=(strLength-1);i>=0;i--) {
			reverseString=reverseString+str.charAt(i);
		}
		if(str.toLowerCase().equals(reverseString.toLowerCase())) {
			System.out.println(str + " is a palindrome");
		}
		else {
			System.out.println(str + " is not a palindrome");
		}

	}

}
