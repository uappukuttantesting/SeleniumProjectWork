package week1.day2;

public class InterSectionBetTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		int Sarr1 = arr1.length;
		int Sarr2 = arr2.length;
		//1) Traverse through each array item for each given array (use nested for loop)
		for (int i = 0; i < Sarr1; i++) {
			for (int j = 0; j < Sarr2; j++) {
		//2) Compare both the arrays
				if(arr1[i]==arr2[j]) {
		//3) Print the matching item	
					System.out.println(arr1[i]+ " is the intersection value");
				}
			}
		}

	}

}
