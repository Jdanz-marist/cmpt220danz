import java.util.*;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter number of students: ");

		int numOfStu = keyboard.nextInt();

		int[] grades = new int[numOfStu];
		String[] names = new String[numOfStu];

		int grade = 0;
		String name = "";

		for(int i = 0; i < numOfStu; i++){
		
			System.out.println("Enter student name");
			name = keyboard.next();
		
			System.out.println("Enter student score");
			grade = keyboard.nextInt();
			
			names[i] = name;
			grades[i] = grade;
			
		}//for
		
		// JA: Were are the arrays sorted?
		for (int i = 0; i < numOfStu; i++) {
			
			names[i] = name;
			grades[i] = grade;
			
		System.out.print(name + " " + grade);
		System.out.println("");
		
		}//for
	
	}//main

}//class question 3
