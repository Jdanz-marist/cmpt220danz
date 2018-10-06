import java.util.*;

public class Question2 {

	public static void main(String[] args) {
		
		double [] array = new double[10];
		double standardDev = 0;
		double mean = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter 10 double integers");
		
		for (int j = 0; j < array.length; j++) {
			
			array[j] = keyboard.nextDouble();
			
		}//for
		
		standardDev = devation(array);
		System.out.println("The standard deviation is: " + standardDev);
		
		mean = mean(array);
		System.out.println("The mean is: " + mean);

	}//main
	
	public static double devation(double numArray[]){
		
        double sum = 0.0, standardDeviation = 0.0;
        
        int length = numArray.length;

        for(double num : numArray) {
            sum += num;
        }//for

        double mean = sum/length;

        for(double num: numArray) {
            standardDeviation += Math.pow(num - mean, 2);
        }//for

        return Math.sqrt(standardDeviation/length);
    }//method
	
	public static double mean(double[] meanArray) {
	    double sum = 0;
	    
	    for (int i = 0; i < meanArray.length; i++) {
	        sum += meanArray[i];
	    }//for
	    
	    return sum / meanArray.length;
	}//method

}//class question 2
