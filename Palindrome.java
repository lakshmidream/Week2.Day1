package week2.day2;

import java.util.Iterator;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String input="MADAm";
		String reverse="";
		int inputLength=input.length();
		
		for (int i = inputLength-1; i >=0  ; i--) {
			
			char test = input.charAt(i);
			reverse = reverse + test;
			
					
		}
		System.out.println(reverse);
		boolean palindrome = reverse.equalsIgnoreCase(input);
		if (palindrome) {
			System.out.println("The input string is a palindrome");
						
		}	
		else {
			System.out.println("The input string is NOT  a palindrome");
		}
	}

}
