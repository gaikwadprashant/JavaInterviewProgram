package prashantJavaExercise;

import java.util.Scanner;

public class PalindromeExample1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number you want to verify ");

		int palindrome = sc.nextInt();
		if (isPalindrome(palindrome)) {
			System.out.println("the given number is Palindrome " + palindrome);

		} else {
			System.out.println("Given number is not Plaindrome " + palindrome);
		}

	}

	public static boolean isPalindrome(int number) {
		int palin = number;
		int reverse = 0;

		while (palin != 0) {
			int remainder = palin % 10;
			reverse = reverse * 10 + remainder;
			palin = palin / 10;

		}
		
		if(palin == reverse){
			return true;
		}

		return false;
	}

}
