import java.util.*;


public class Question1 {

	public static void main(String[] args) {
		
	Scanner keyboard = new Scanner(System.in);
	
	int num = 1;
	int sum = 0;
	int evenNumbers = 0;
	double avg = 0;
	
	while (num != 0) {
		
		System.out.println("Enter a positive integer, the input ends with a 0:");
		
		num = keyboard.nextInt();
		
		if (num % 2 == 0) {
			
			evenNumbers += 1;
			
			}//if
		
		sum += num;
		
		avg = sum / evenNumbers; 
		
		}//while
	
		System.out.println("The number of even numbers: " + evenNumbers);
		System.out.println("The total sum: " + sum);
		System.out.println("The average is: " + avg);
		
	}//main

}//class question 1
