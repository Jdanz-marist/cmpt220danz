import java.util.*;

public class Question5 {

	public static void main(String[] args) {
	
		double one;
		double two;
		double three;
		double avg;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter value one");
		one = keyboard.nextDouble();
		
		System.out.println("Enter value two");
		two = keyboard.nextDouble();

		System.out.println("Enter value three");
		three = keyboard.nextDouble();
		
		avg = average(one, two, three);
		System.out.println("The average is: " + avg);
		
	}//main
	
	public static double average(double a, double b, double c) {
		
		double avg;
		double sum;
		
		sum = a + b + c;
		
		avg = sum/3;
		
		return avg;
		
	}//method
	

}//class question 5
