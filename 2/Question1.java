import java.util.*;


public class Question1 {

	public static void main(String[] args) {
		
		double one = 0;
		double two = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number for the first comparasion");
		
		one = keyboard.nextDouble();
		
		System.out.println("Enter a number for the second comparasion");
		
		two = keyboard.nextDouble();
		
		System.out.println(one + " is less than " + two + " ? ");
		System.out.println(one < two);
		
		System.out.println(one + " is less than or equal to " + two + " ? ");
		System.out.println(one <= two);
		
		System.out.println(one + " is equal to " + two + " ? ");
		System.out.println(one == two);
		
		System.out.println(one + " does not equal " + two + " ? ");
		System.out.println(one != two);
		
		System.out.println(one + " is greater than " + two + " ? ");
		System.out.println(one > two);
		
		System.out.println(one + " is greater than or equal to " + two + " ? ");
		System.out.println(one >= two);
	

	}//main

}//class question 1
