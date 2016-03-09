package InterQuestions;

import java.util.Scanner;

public class SwapTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers ");
		int numberOne = sc.nextInt();
		int numberTwo = sc.nextInt();
		int number1 = 20;
		int number2 = 30;
		System.out.println("Numbers before swap are "+number1+" and "+number2);
		System.out.println("Numbers before swap are "+numberOne+" and "+numberTwo);
		
		number1 = number1 + number2;
		number2 = number1 - number2;
		number1 = number1 - number2;
		String str= "tset";
		numberOne = numberOne * numberTwo;
		numberTwo = numberOne / numberTwo;
		numberOne = numberOne / numberTwo;
		
		System.out.println("Numbers after swap are "+number1 +" and "+number2);
		System.out.println("Numbers after swap are "+numberOne +" and "+numberTwo);

	}

}
