import java.util.*;

public class MyLong {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		long value = 0;
		boolean v;
		int va;
		
		Object MyLong; 
		
		v= isEven();
		v = isOdd();
		v = isPrime();
		
		va = isEven();
		va = isOdd();
		va = isPrime();

		value = isEven();
		value = isOdd();
		value = isPrime();
		
		MyLong = isEven();
		MyLong = isOdd();
		Mylong = isPrime();
		
	}//main
	
	public static long getValue() {
		
	myvalue = value;
		
	}//method
	
	public static boolean isEven() {
		Scanner keyboard = new Scanner(System.in);
		
		int value;
		
		System.out.println("enter in a integer value");
		value = keyboard.nextInt();
		
		 if (value % 2 == 0) {
	            
			 System.out.println(value + " is an even number.");
	     
	            return true;
	            
	        }//if
		 
		 	else {
		 		
	            System.out.println(value + " is not an even number.");
	            
	            return false;
	        
		 	}//else
		
	}//method
	
	public static boolean isOdd() {
		
		Scanner keyboard = new Scanner(System.in);
		
		int value;
		
		System.out.println("enter in a integer value");
		value = keyboard.nextInt();
		
		if (value % 2 == 0) {
            
			 System.out.println(value + " is an even number.");
	     
	            return false;
	            
	        }//if
		 
		 	else {
		 		
	            System.out.println(value + " is not an even number.");
	            
	            return true;
	        
		 	}//else
		
	}//method
	
	public static boolean isPrime() {
		
		Scanner keyboard = new Scanner(System.in);
		
		int value;
		
		System.out.println("enter in a integer value");
		value = keyboard.nextInt();
		
		 if (value == 1) {
		 
			 return true;
		    
		 }//if 
		 
		 else {
			 
		        for(int i = 2; i <= Math.sqrt(value); i++) {
		           
		        	if (value % i == 0) return false;          
		    
		        }//for
		        
		    return true;

		 }//else
		
	}//method
	
	public static long isEven(long value) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("enter in a integer value");
		value = keyboard.nextLong();
		
		 if (value % 2 == 0) {
	            
			 System.out.println(value + " is an even number.");
	            
	        }//if
		 
		 	else {
		 		
	            System.out.println(value + " is not an even number.");
	           
		 	}//else
		 
		return value;
		
	}//method
	
	public static long isOdd(long value) {
			Scanner keyboard = new Scanner(System.in);
		
		System.out.println("enter in a integer value");
		value = keyboard.nextLong();
		
		
		if (value % 2 == 0) {
            
			 System.out.println(value + " is an even number.");
	            
	        }//if
		 
		 	else {
		 		
	            System.out.println(value + " is not an even number.");
	            
		 	}//else
		
	    return value;
	    
	}//method
	
	public static long isPrime(long value) {
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("enter in a integer value");
		value = keyboard.nextLong();
		
		 if (value == 1) {
		    
		 }//if 
		 
		 else {
			 
		        for(int i = 2; i <= Math.sqrt(value); i++) {
		           
		        	if (value % i == 0) {
		        		
		        		System.out.println("the value is not prime");
		        		
		        	}//if
		    
		        }//for
		        
		    return value;

		 }//else
		
	}//method
	
	public static Object isEven(Object MyLong) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("enter in a integer value");
		MyLong = keyboard.next();
		
		 if (MyLong % 2 == 0) {
	            
			 System.out.println(MyLong + " is an even number.");
	            
	        }//if
		 
		 	else {
		 		
	            System.out.println(MyLong + " is not an even number.");
	           
		 	}//else
		 
		return MyLong;
		
	}//method
	
	public static Object isOdd(Object MyLong) {
			Scanner keyboard = new Scanner(System.in);
		
		System.out.println("enter in a integer value");
		MyLong = keyboard.next();
		
		
		if (MyLong % 2 == 0) {
            
			 System.out.println(MyLong + " is an even number.");
	            
	        }//if
		 
		 	else {
		 		
	            System.out.println(MyLong + " is not an even number.");
	            
		 	}//else
		
	    return MyLong;
	    
	}//method
	
	public static Object isPrime(Object MyLong) {
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("enter in a integer value");
		MyLong = keyboard.next();
		
		 if (MyLong == 1) {
		    
		 }//if 
		 
		 else {
			 
		        for(int i = 2; i <= Math.sqrt(value); i++) {
		           
		        	if (MyLong % i == 0) {
		        		
		        		System.out.println("the value is not prime");
		        		
		        	}//if
		    
		        }//for
		        
		    return MyLong;

		 }//else
		
	}//method
	
	
	public static int parseInt(char[] a){
	   
		int result=0;
	    
	    for(int i=0;i<a.length;i++){
	    	
	        result=result*base+(Character.getNumericValue(a[i]);
	    
	    }//for
	    
	    return result;
	
	}//method
	
	public boolean equals(Object MyLong) {
	    
		if (MyLong instanceof Long) {
	        return value == ((Long)MyLong).longValue();
	    }//fi
	    
	    return false;
	
	}//method
	
}//class
