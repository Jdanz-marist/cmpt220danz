import java.util.*;

public class Question3 {

	public static void main(String[] args) {
		String userInput = null;
		boolean palindrome;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Input a string to check for palindrome");
		
		userInput = keyboard.nextLine();
		
		userInput = reverse(userInput);
		
		palindrome = isPalindrome(userInput);
		
		System.out.println(userInput);
		System.out.println(palindrome);
		

	}//main
	
	public static boolean isPalindrome(String s) {
		  int n = s.length();
		  for (int i = 0; i < (n/2); ++i) {
		     if (s.charAt(i) != s.charAt(n - i - 1)) {
		         return false;
		     }//if
		  }//for

		  return true;
		  
	}//method
	
	public static String reverse(String input){
		
	    char[] in = input.toCharArray();
	    int begin=0;
	    int end=in.length-1;
	    char temp;
	    
	    while(end>begin){
	    	
	        temp = in[begin];
	        in[begin]=in[end];
	        in[end] = temp;
	        end--;
	        begin++;
	        
	    }//while
	    
	    return new String(in);
	    
	}//method

}//class question 3
