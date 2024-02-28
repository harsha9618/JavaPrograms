package basics;

public class PalindromeOrNotUsingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int r,sum=0,temp; int n=3334; temp=n; while(n>0) { r=n%10; sum=(sum*10)+r;
		 * n=n/10; } if(temp==sum) { System.out.println("Palindrome Number"); } else {
		 * System.out.println("Not A Palindrome Number"); }
		 * 
		 * }
		 */
		/*
		 * 
		 * int r, sum = 0, temp; int n = 2344321; temp = n; while (n > 0) { r = n % 10;
		 * sum = (sum * 10) + r; n = n / 10; } if (temp == sum) {
		 * System.out.println("palindrome Number"); } else {
		 * System.out.println("Not A Palindrome"); }
		 * 
		 */
		
		int r,sum=0,temp;
		int n=12321;
		 temp=n;
		 while(n>0) {
			 r=n%10;
			 sum=(sum*10)+r;
			 n=n/10;
		 }
		 if(temp==sum)
			 System.out.println("Palindrome Number");
		 else
			 System.out.println("Not a Palindrome Number");
	}
}
