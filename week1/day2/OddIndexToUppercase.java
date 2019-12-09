package week1.day2;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		String test = "changeme";
//1. Convert the String to character array
		//char[] strarray = {'c','h','a','n','g','e','m','e'};
		char[] strarray = test.toCharArray();
//2. Traverse through each character (using loop)
		for (int i = 0; i < 8; i++) {
//3. find the odd index within the loop (use mod operator)
			if (i%2!=0) {
/*4. within the loop, change the character to uppercase if the index is odd else don't change
     (use Character.toUpperCase(ch) and print without new line as System.out.print(ch);*/
				char OddUC = Character.toUpperCase(strarray[i]);	
				System.out.print(OddUC);
			}
			else {
				System.out.print(strarray[i]);
			}

		}

	}

}
