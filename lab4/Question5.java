import java.util.Random;

public class Question5 {

	public static void main(String[] args) {
		
		int random = 0;
		double avg = 0;
		int lowerCount = 0;
		int upperCount = 0;
		
		Random rand = new Random();
		
		for (int j = 0; j < 1000; j++){
		
			random = rand.nextInt();
			
			avg = average(random);
			
			System.out.println(random);
			
			if (random < avg) {
				
				lowerCount++;
				
			}//if
			
			if (random > avg) {
				
				upperCount++;
				
			}//if
		
		}//for
		
		System.out.println(" ");
		
		System.out.println("The average is: " + avg);
		System.out.println("The lower count is: " + lowerCount);
		System.out.println("The upper count is: " + upperCount);
		
	}//main
	
		// JA: This does not calculate the average. You can only calculate the
		// average once all the elements are created.
		public static double average(int r) {
		
		double avg;
		int sum = 0;
		
		sum += r;
		
		avg = sum/1000;
		
		return avg;
		
	}//method

}//class question 5