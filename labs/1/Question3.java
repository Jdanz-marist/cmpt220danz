import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		double ounces;
		double grams =0;
		
		//keyboard scanner
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a value for ounces:");
		
		ounces = keyboard.nextDouble();
		
		grams = ounces * 28.3495;
		
		System.out.println(ounces + " ounces is " + grams + " grams");

	}//main	

}//class question 3
