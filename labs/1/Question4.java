import java.util.*;

public class Question4 {

	public static void main(String[] args) {
		
		double mass = 0;
		double speedOfLight = 299972458;
		double energy = 0;
		
		//keyboard scanner
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a value for mass");
		
		mass = keyboard.nextDouble();
		
		energy = mass * (speedOfLight * speedOfLight);
		
		System.out.println("The answer is: " + energy);
		
	}//main

}//class question 4
