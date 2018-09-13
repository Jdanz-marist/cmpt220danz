import java.util.*;


public class Question4 {

	public static void main(String[] args) {
		
		char one = 0;
		char two = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter first chracter");
		
		one = keyboard.nextLine().charAt(0);
		
		System.out.println("Enter second character");
		
		two = keyboard.nextLine().charAt(0);
		
		System.out.print("Result: ");
		System.out.println(one + two);
		
	}//main

}//class question 4
