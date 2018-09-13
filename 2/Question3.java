import java.util.*;

public class Question3 {

	public static void main(String[] args) {
		
		int lower;
		int upper;
		int result, result2, result3;
		
		Random r = new Random();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a lower limit integer");
		
		lower = keyboard.nextInt();
		
		System.out.println("Enter a upper limit integer");
		
		upper = keyboard.nextInt();
		
		result = r.nextInt(upper - lower) + lower;
		result2 = r.nextInt(upper - lower) + lower;
		result3 = r.nextInt(upper - lower) + lower;
			
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
			

	}//main

}//class question 3
