import java.util.Random;

public class Question2 {

	public static void main(String[] args) {
		
		for (int a = 0; a < 5; a++) {
			for (int i = 0; i < 5; i++) {
		
				Random rnd = new Random();
				char c = (char) (rnd.nextInt(26) + 'a');
		
				System.out.print(c + " ");

			}//for
	
		System.out.println(" ");
		
		}//for
	
	}//main	

}//class question 2