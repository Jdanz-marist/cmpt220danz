
public class Question1 {

	public static void main(String[] args) {
	
		int inches = 1;
		double centi = 2.54;
		int cm = 1;
		double in = 0.39;
		
		do {
			// JA: You should use the printf statement
			System.out.printf("%2d%10.2f | %3d%10.2f\n", inches, centi, cm, in);
//			System.out.println(" ");
			
			inches++;
			centi += 2.54;
				
				cm += 5;
				in += 1.97;
				
			}while(inches < 51 && cm < 252);

	}//main

}//class question 1