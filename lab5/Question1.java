import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		
		double [] array = new double[10];
		double greatest = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter 10 double integers");
		
		for (int j = 0; j < array.length; j++) {
			
			array[j] = keyboard.nextDouble();
			
		}//for
		
		greatest = max(array);
		
		System.out.println("the greatest double entered was: " + greatest);

	}//main	
	
	public static double max (double[] inputArray){ 
	    double maxValue = inputArray[0]; 
	    for(int i = 1; i < inputArray.length; i++){ 
	      
	    	if(inputArray[i] > maxValue){ 
	    		
	         maxValue = inputArray[i];
	         
	      }//if
	    	
	    }//for  
	    return maxValue; 
	  }//method

}//class question 1
