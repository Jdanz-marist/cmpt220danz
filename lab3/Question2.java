import java.util.*;

public class Question2 {

	public static void main(String[] args) {
		
		int counter=0;
		
	    for(int i = 100; i <= 500; i++) {
	    	
	        if(i % 5==0 && i % 7==0) {
	        	
	       
	            System.out.print(i +" ");
	            counter++;
	        
	        }//if
	        
	        if(counter==10) {
	      
	            System.out.println();
	            counter=0;
	        
	        }//if
	        
	    }//for
	    
	}//main

}//class question 2
