package Interviewsamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {

	public static void main(String[] args) throws IOException {
		BufferedReader  rd = new BufferedReader(new InputStreamReader(System.in));
		String original = rd.readLine();
		String reverse = "";
		
		for(int i = original.length()-1; i >= 0; --i){
			reverse += original.charAt(i);
		}
		System.out.println("Reverse string is "+reverse);
		
		if(original.equals(reverse)){
			System.out.println("String is palindrome");
		} else{
			System.out.println("String is not Palindrome");
		}
	}

}
