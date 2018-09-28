
public class Question1 {

	public static void main(String[] args) {
	
		int inches = 1;
		double centi = 2.54;
		int cm = 1;
		double in = 0.39;
		
		do {
			
			System.out.print(inches + " " + centi + "    " + cm + " " + in);
			System.out.println(" ");
			
			inches++;
			centi += 2.54;
				
				cm += 5;
				in += 1.97;
				
			}while(inches < 51 && cm < 252);

	}//main

}//class question 1