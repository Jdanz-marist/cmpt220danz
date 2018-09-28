import java.util.*;

public class Question7 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int[] input1 = new int[10];
		
		System.out.println("Input ten values for the array");
		
			
            input1[10] = keyboard.nextInt();

        int[] output = new int[10];

        output = removeDuplicates(input1);
        
        System.out.println(output);
		
	}//main
	
	 public static int[] removeDuplicates(int[] input){
         
	        int j = 0;
	        int i = 1;
	        
	        if(input.length < 2){
	        
	        	return input;
	        	
	        }//if
	        
	        while(i < input.length){
	        	
	            if(input[i] == input[j]){
	                
	            	i++;
	            	
	            }//if
	            
	            else{
	               
	            	input[++j] = input[i++];
	            
	            }//else
	            
	        }//while
	        
	        int[] output = new int[j+1];
	        
	        for(int k=0; k < output.length; k++){
	            
	        	output[k] = input[k];
	            
	        }//for
	         
	        return output;
	        
	    }//method
	     
}//class question 7