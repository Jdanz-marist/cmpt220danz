import java.util.*;

public class Question6 {

	public static void main(String[] args) {
	
		  int row = 5;
		  int col = 5;
		  double[] avg;
	      int[][] matrix = new int[row][col]; 
	      
	      Scanner keyboard = new Scanner(System.in);
	      
	      for(row = 0; row< matrix.length; row++){ 
	              
	    	  for(col = 0; col< matrix[row].length; col++){
	    		  
	                   System.out.println("enter the elementss for the Matrix"); 
	                  matrix[row][col] = keyboard.nextInt(); 
	              
	    	  }//for
	    	  
	    	  System.out.println(); 
	          
	      }//for
	      
	      avg = averageColumn(matrix);
	      System.out.println("The column avg is " + avg);
	      
	}//main
	
	 public static double [] averageColumn(int[][] row) {
	        
		 double average[] = new double[row[0].length];
	        double total = 0;
	        
	        for (int i = 0; i < row[0].length; i++){
	            
	        	for (int j = 0; j< row.length; j++){             
	                
	        		total = total + row[i][j];
	            
	        	}//for
	            
	            average[i] = total / row[0].length;
	        }//for
	        
	        return average;
	    }//method

}//class question 6
