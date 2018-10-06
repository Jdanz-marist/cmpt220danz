import java.util.*;

public class AnotherBrick {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter height");
		int height = keyboard.nextInt();

		System.out.println("Enter width");
		int width = keyboard.nextInt();

		System.out.println("Enter bricks");
		int bricks = keyboard.nextInt();

		boolean build = true;

		int[] nums = new int[bricks];

		for (int i = 0; i < nums.length; i++) {

			System.out.println("Enter total num");
			nums[i] = keyboard.nextInt();

		}//for

		int brick = 0;

		int wid = 0;

		main: for (int high = 1; high <= height; high++){

				wid = width;

				while (wid > 0){

					if (brick == nums.length){

						build = false;

						break main;

					}//if

					else{

						wid -= nums[brick];

					}//else
					
					brick++;

					}//while

				if (wid < 0){

					build = false;

					break main;

				}//if

		}//for

		if (build)

			System.out.println("YES");

		else

			System.out.println("NO");

	}//main

}//class Another brick in the wall
