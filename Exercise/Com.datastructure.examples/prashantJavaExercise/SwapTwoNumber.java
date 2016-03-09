package prashantJavaExercise;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number ");
		int firstNumber = sc.nextInt();
		System.out.println("Enter second number ");
		int secondNumber = sc.nextInt();
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;
		System.out.println("Enter first number "+firstNumber);
		System.out.println("Enter Second number "+secondNumber);

	}

}
