package nazmuljavaproblemssolutions;

import java.util.Scanner;
//MAY-17-2022

public class Naz_Problem_04_Printing_Half_Peramid_By_Inputing_A_Number {

	/*-
	 This program runs a half pyramid which means , I will take "n" as input and
	 its going to print from 1 then, "1 2" then 1 2 3"" one by one 
	 till "1 2 3....n"
	 */
	public static void main(String[] args) {

		Scanner row = new Scanner(System.in);
		System.out.print("Enter just one integer: ");

		// Take an integer from console
		int pai = row.nextInt();

		// First, i =1 , if i is less than or equal to "pai" then goto the below
		// statement(goes to second loop
		for (int i = 1; i <= pai; i++) {

			// now first j = 1, now it compares its value with "i"
			// if the value is less than "i" or equal to "i" than j becomes
			// such as 1 to 2 , print j value and a white space
			// now again check the "j" value 2 with "i" and compares and prints
			// j value until j value becomes greater than i. Then it goes out from this loop
			// and gives permission to above loop
			// the mother loop's "i" value increases , then compares with "pai"
			// if "i" is smaller or equal to "pai"
			// again comes to below child for loop
			// and child for loop again starts from 1 and runs until its greater than i
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
		row.close();

	}
}
