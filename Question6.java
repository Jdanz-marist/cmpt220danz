import java.util.*;

public class Question6 {

	public static void main(String[] args) {
		
		String vowelCount;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a string value");
		
		vowelCount = keyboard.nextLine().toLowerCase();
		
		int counter = vowels(vowelCount);
		System.out.println("The number of vowels in the string are " + counter);
		
	}//main
	
	public static int vowels(String count) {
		
		int counter = 0;
		for (int i = 0; i < count.length(); ++i) {
		    switch(count.charAt(i)) {
		        case 'a':
		        case 'e':
		        case 'i':
		        case 'o':
		        case 'u':
		            counter++;
		            break;
		        default:
		            // do nothing
		    }//switch
		}//for
		
		return counter;
		
	}//method

}//class question 6
