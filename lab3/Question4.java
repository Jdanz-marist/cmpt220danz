import java.util.*;

public class Question4 {

	public static void main(String[] args) {
	       int topPrime = 15000;
	        int current = 2;
	        int count = 1;
	        int lastPrime = 2;

	       
	        while (count <= topPrime) {

	            boolean prime = true;

//	            int top = (int)Math.sqrt(current) + 1;

	            for (int i = 2; i < count; i++) { // JA
	                if (count % i == 0) {
	                    prime = false;
	                    break;
	                }
	            }

	            if (prime) {
	                lastPrime = count;
	            }
				count++;
//	            if (current == 2) {
//	             current++;
//	            } else {
//	                current = current + 2;
//	            }
	        }

	        System.out.println("Last prime = " + lastPrime);
	    
	
	
	}//main

}//class question 4
