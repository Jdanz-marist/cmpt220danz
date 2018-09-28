import java.util.*;

public class Question4 {

	public static void main(String[] args) {
		
		  Scanner keyboard = new Scanner(System.in); 
		  
	        String str;
	        
	        System.out.println("Input string");
	        str = keyboard.nextLine();
	        
	        getOccuringChar(str); 
		 

	}//main 
	
	static void getOccuringChar(String str) 
    { 
        
        int count[] = new int[256]; 
  
        int len = str.length(); 
  
       
        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++; 
        }//for
      
        char ch[] = new char[str.length()]; 
        
        for (int i = 0; i < len; i++) {
        	
            ch[i] = str.charAt(i); 
            int find = 0;
            
            for (int j = 0; j <= i; j++) { 
      
                if (str.charAt(i) == ch[j]) {
                
                	find++;                 
                
                }//if
                
            }//for
  
            if (find == 1) { 
                
            	System.out.println("Number of Occurrence of " + 
                
            			str.charAt(i) + " is:" + count[str.charAt(i)]);             
            
            }//if
	
        }//for
        
    }//method

}//class question 4