import java.util.*;

public class Question7 {

	public static void main(String[] args) {
		
		boolean upperMatrix;
		
		 Scanner keyboard = new Scanner(System.in);
		 
	        System.out.print("Enter the size of the matrix : ");
	        
	        int m = keyboard.nextInt();
	        int A[][]=new int[m][m]; 
	        
	        for(int i = 0; i < A.length; i++){
	            	
	                System.out.print("Enter an element : ");
	                A[i][i] = keyboard.nextInt();
	            
	        }//for
	        
	        upperMatrix = isUpperTriangular(A);
	        
	        System.out.println("The matrix is a upper trangular matrix " + upperMatrix);

	}//main
	
	public static boolean isUpperTriangular(int[][] array) {
		
		 int p=0;
		 boolean yes = true;
         
	        for(int i = 0; i < array.length; i++){
	            	
	                if(array[i][i]!=0){
	                    
	                	p=1;
	                    break;
	            
	                }//if
	            
	        }//for
	         
	        if(p != 0) {
	        
	        	yes = false;
	        
	        }//if
	        else
	            yes = true;
	        
	        return yes;
		
	}//method

}//class question 7
