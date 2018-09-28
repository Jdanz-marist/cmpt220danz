import java.util.*;

public class Question6 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter positive values int the array end program by entering -1");
		
		int [] arr = new int[1000];
		int n = 0;
		
		for (int i = 1; n < 1000; n++) {
			
			n = keyboard.nextInt();
			if (n == -1)
				break;
			arr[n] = i;
			
		}//for
	
	}//main
	
	public static void addEnd (int lastNum, int [] array) {
		
		for (int n = 1; n < 11; lastNum++) {
			
			array[lastNum] = n;
			
		}//for
		
		for (int i = 0; i < lastNum; i++) {
			
			System.out.print(array[i] + " ");
			
		}//for
		
		System.out.println();
		addAtPlace(lastNum, array);
		
	}//method
	
	public static void addAtPlace (int last, int [] array2) {
		
		array2[2] = 10;
		array2[6] = 100;
		
		for (int i = 0; i < last; i++) {
			
			System.out.print(array2[i] + " ");
			
		}//for
		
		
	}//method

}//class question 6
