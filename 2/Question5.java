import java.util.*;

public class Question5 {

	public static void main(String[] args) {

		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the first string");
		
		String one = keyboard.next();
		
		System.out.println("Enter the second string");
		
		String two = keyboard.next();
		
		String top = one;
		String bottom = two;
		
		if( top.compareTo(two) > 0) { 
		
			top = two; 
		
		}//if 
		
		if( top.compareTo(one) > 0) { 
		
			top = one; 
		
		}//if 
		
		if( bottom.compareTo(two) < 0) { 
		
			bottom = two; 
		
		}//if
		
		if( bottom.compareTo(one) < 0) { 
		
			bottom = one; 
		
		}//if
		
		System.out.println(top);
		System.out.println(bottom);
		
	}//main

}//class question 5
