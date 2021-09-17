package week2.day2;

public class FindTypes {

	public static void main(String[] args) {
		String input ="The F !@#$% 12345";
		
		int digit=0;
		int chars=0;
		int splchar=0;
		int space=0;
		
		char[] charArray = input.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			Character char1=charArray[i];
			
			
			if (char1.isLetter(charArray[i])) {
				chars=chars+1;
				}
			else if (char1.isDigit(charArray[i])) {
				digit=digit+1;
			}
			else if (char1.isSpaceChar(charArray[i])) {
				space=space+1;
			}
			else  {
				splchar=splchar+1;
			}
		}
		System.out.println("The number of Characters" + chars);
		System.out.println("The number of Digits" + digit);
		System.out.println("The number of spaces " + space);
		System.out.println("The number of Spl characters" + splchar );

	}

}
