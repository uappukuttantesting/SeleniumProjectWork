package week1.day2;

public class ReplaceStringAsBlank {
	public static void main(String[] args) {
		// Use the declared String text as input
		String text = "We learnt java basics as part of java sessions in week1";
		// Initialise an integer variable as count
		int count = 0;
		//a) Split the String into array and iterate over it
		String[] Stext = text.split(" ");
		for (String eachword : Stext) {
			System.out.println(eachword);
		}
		//b) Initialise another loop to check whether the word is there in the array
		for (int i = 0; i < Stext.length; i++) {
			if(Stext[i]!=null) {
				//c) if it is available then increase and count by 1.
				count = count+1;
				//d) if the count > 1 then replace the word as ""
				if (count > 1) {
					String replacedWord = Stext[i];
					Stext[i] = Stext[i].replace(Stext[i], " ");
					//e) print the each word
					System.out.println("The word ['"+replacedWord+"'] is Replaced with Blank");
				}
			}
		}
	}
}