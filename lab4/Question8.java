import java.util.*;

public class Question8 {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		
		int[] num = new int [100];	
		
		for (int i = 0; i < 100; i++) {
			
			int n = keyboard.nextInt();
			
			if (n == 0)
				break;
			
			num[i] = n;
			
		}//for
		
		Arrays.sort(num);
		
		for (int i = 0; i < 100; i++) {
			
			if (num[i] == 0)
				continue;
			System.out.println(num[i]);
			
		}//for

	}//main
	
}//class question 8