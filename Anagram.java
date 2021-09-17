package week2.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String input1="SILENT";
		String input2="LISTE";
		boolean status=true;
		
		if (input1.length()==input2.length()) {
			char[] arr1 = input1.toCharArray();
			char[] arr2 = input2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
	
			for (int i = 0; i < arr2.length; i++) {
				if (arr1[i]!=arr2[i]) {
					
					status=false;
					
					
				}
				
				
			}
			
		}
		else {
			System.out.println("The length of two input string is not equal .The input values are not anagram");
		}
		
		if (status==true) {
			System.out.println("The input is anagram");
			
		}
		else {
			System.out.println("The input is NOT anagram");
		}
		

	}

}
