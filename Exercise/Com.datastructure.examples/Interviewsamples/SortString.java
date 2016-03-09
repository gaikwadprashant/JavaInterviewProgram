package Interviewsamples;

import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
		System.out.println("Enter the input String ");
		Scanner scan = new Scanner(System.in);
		String orgStr = scan.nextLine();
		System.out.println("Original string is " + orgStr);
		char temp = 0;
		//String test = "asdfgh";
		char[] chars = orgStr.toCharArray();
		//char[] charsNew = test.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < chars.length; j++) {
				if (chars[j] > chars[i]) {
					temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}
			}
		}

		for (int k = 0; k < chars.length; k++) {
			System.out.println(chars[k]);
		}

		/*
		 * for (int i = 0; i <charsNew.length; i++) {
		 * 
		 * for (int j = 0; j < charsNew.length; j++) {
		 * 
		 * if(charsNew[j]>charsNew[i]){ temp=charsNew[i]; charsNew[i]=charsNew[j];
		 * charsNew[j]=temp; }
		 * 
		 * }
		 * 
		 * }
		 * 
		 * for(int k=0;k<chars.length;k++){ System.out.println(chars[k]); }
		 */

	}

}
