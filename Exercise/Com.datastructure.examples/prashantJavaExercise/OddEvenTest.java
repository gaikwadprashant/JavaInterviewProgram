package prashantJavaExercise;

import java.io.Console;
import java.util.Scanner;

public class OddEvenTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		
		int number = sc.nextInt();
		
		if((number&1)==0){
			System.out.println("The given  number is Even  "+ number);
			
		} else{
			System.out.println("The given  number is Odd  "+ number);
		}
	}

}
