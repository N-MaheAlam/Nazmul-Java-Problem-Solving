package nazmuljavaproblemssolutions;

import java.util.ArrayList;
// MAY-18-2022
import java.util.Scanner;
/*-
  This program takes input from the console until its 0.
  Then, prints the value of ArrayList one by one.
  Then removes the last element and prints the ArrayList
 */

public class Naz_Problem_12_ArrayList_Input_Unique_Until_0_Print_Values {

	public static void main(String[] args) {

		// Declare an Generic ArrayList which type is Integer
		ArrayList<Integer> num = new ArrayList<>();

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the values one by one and enter 0 to terminate:");

		int value;

		do {
			// First take input whether 0 or anything
			value = in.nextInt();

			// If the value is not in ArrayList num and if the value is not 0,
			// add this value in ArrayList num
			if (!num.contains(value) && value != 0)

				num.add(value);

			// taking input until i press 0 and each time checking the above if condition
			// line 20
		} while (value != 0);

		// printing the values of num ArrayList

		for (int i = 0; i < num.size(); i++)
			System.out.print(num.get(i) + " ");
		System.out.println();

		// removing the last element from ArrayList num
		num.remove((num.size() - 1));

		System.out.println("After removing the last element: ");

		// printing the value in arrayList using enhance for loop
		for (int number : num)
			System.out.print(number + " ");

		in.close();
		///
	} // end main method

} // end class
