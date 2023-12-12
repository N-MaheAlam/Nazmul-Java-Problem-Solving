package nazmuljavaproblemssolutions;

//MAY-18-2022
/*- 
	Reversing the String using for loop 
 */
import java.util.Scanner;

public class Naz_Problem_07_String_Reverse_Using_For_Loop {

	public static void main(String[] args) {

		// Create a Scanner object
		Scanner sc = new Scanner(System.in);

		// Print this line
		System.out.print("Enter the first String: ");

		// Now, Scan a string
		String t = sc.nextLine();

		// create a variable "rev"
		String rev = "";

		// Now, run a loop where the value of "i" is t.length -1 ( suppose if
		// if length is 10 , i value = 9
		// the loop continues and decreases the "i" value one by one
		// until the i>= 0
		// now each time "i" value act as index number for each character
		// of string "t" and every time if the value matches the condition
		// then each character is added in "rev" string and "i" value decreased
		// by 1 each time. loop first picks the last index of "t"
		// goes till the 0 index of "t" and character each time is added
		// with new "rev" and stops till last index
		for (int i = t.length() - 1; i >= 0; i--) {
			rev = rev + t.charAt(i);
		}

		// printing the new reverse string that we have got from the loop
		System.out.print("Now the reverse string is : " + rev);

		// starts from index[2] and goes till element number 5 not index[5]
		String cutString = rev.substring(2, 5);

		// Print the new substring
		System.out.println("\n The new cutting String is: " + cutString);

		sc.close();

	} // main method
}// class
