import java.util.*;

public class Question5 {

	public static void main(String[] args) {
		
		 int col = 0;
		 int row = 0;
		 int[][] trans = new int[col][row];

	        Scanner keyboard = new Scanner(System.in);
	        int m = keyboard.nextInt();
	        col = m;
	        int n = keyboard.nextInt();
	        row = n;

	        int[][] arr = new int[row][col];
	        
	        for (int i = 0; i < row; i++) {
	            
	        	for (int j = 0; j < col; j++) {
	                
	            	arr[i][j] = keyboard.nextInt();
	                
	                System.out.print(arr[i][j] + " ");
	            }//for
	            
	            System.out.println();
	        }//for
	        
	        for (int i = 0; i < row; i++) {
	        	
	            for (int j = 0; j < col; j++) {
	                
	            	trans[j][i] = arr[i][j];
	            	
	            }//for
	        
	        }//for
	        
	        for (int i = 0; i < col; i++) {
	        	
	            for (int j = 0; j < row; j++) {
	                
	            	System.out.print(trans[i][j] + " ");

	            }//for
	            
	            System.out.println();
	        }//for
		
	}//main

}//class question 5
