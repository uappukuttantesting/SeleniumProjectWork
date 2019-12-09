package week1.day2;

public class ReverserTheEvenWords {

	public static void main(String[] args) {
		// Here is the input
		String test="I am a software tester";
		int counter = 0;
		char evenchar;
		// a) split the words and have it in an array
		String[] SplitWords = test.split(" ");
		//b) Traverse through each word (using loop)
		for (String Splitstring : SplitWords) {
			//c) find the odd index within the loop (use mod operator)
			if(counter%2==0) {
				//d) Convert words to character array if the position is even 
				char[] charsplit = Splitstring.toCharArray();
				System.out.println(charsplit);
				//e) print the even position words in reverse order using another loop (nested loop)
				for (int i = Splitstring.length()-1; i>=0 ; i--) {			
					System.out.print(charsplit[i]);
				}
			}
			//d) if odd print the word as it is(concatenate space at the end).
			else {
				System.out.print(Splitstring +" ");
			}
			counter = counter + 1;
		}
	}
}