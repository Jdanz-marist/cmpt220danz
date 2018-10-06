import java.util.*;

public class Question4 {

	public static void main(String[] args) {
		
		int [] one = new int[6];
		int [] two = new int[6];
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the first array");
		
		for (int j = 0; j < one.length; j++) {
			
			one[j] = keyboard.nextInt();
			
		}//for
		
		System.out.println("Enter the second array");
		
		for (int i = 0; i < two.length; i++) {
			
			two[i] = keyboard.nextInt();
			
		}//for
		
		boolean identical = equal(one, two);
		
		System.out.println("The two arrays are identical " + identical);

	}//main
	
	public static boolean equal(int[] x, int[] y) {
		
		boolean equal = true;
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		if (x != y) {
			
			equal = false;
			
		}//if
		
		if (x == y) {
			
			equal = true;
			
		}//if
		
		return equal;
		
	}//method

}//class question 4
