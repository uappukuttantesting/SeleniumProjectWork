package week1.day1;

public class MyFirstJavaExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyFirstJavaExercise obj1 = new MyFirstJavaExercise();
		obj1.largestNumber(121, 145, 199);
	}

	public void largestNumber(int a, int b, int c) {
		if ( a > b && a > c) {
			System.out.println("The Number :"+ a + " is greater than "+b +" and" +c);
		}
		if ( b > a && b > c) {
			System.out.println("The Number :"+ b + " is greater than "+a +" and " +c);
		}
		else {
			System.out.println("The Number :"+ c + " is greater than "+a +" and " +b);
		}
	}
}


