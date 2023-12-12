package nazmuljavaproblemssolutions;

import java.util.InputMismatchException;

//MAY-22-2022

/*-
	This program shows the use of exception handling in do while loop and how 
	to control a loop. take input as integer and continue the process until the 
	user input any other thing and the user input any symbol or character the program 
	stops 
 */

import java.util.Scanner;

public class Naz_Problem_18_Exception_Handling_Using_Do_While_Loop {

	public static void main(String[] args) {

		// Create a scanner object
		Scanner input = new Scanner(System.in);

		// a boolean variable
		boolean continueInput = false;

		// No matter what is the condition in while line, at least for one time
		// run the below statement. Now, if the input is an integer then the
		// "continueInput" becomes from false to true and it continues to go through the
		// try block but it the input is not an integer then the control goes to catch
		// line
		// and run the catch blocks and stop
		do {
			try {
				// enter an integer line print
				System.out.println("Enter the integer: ");

				// enter from console
				int a = input.nextInt();

				// turn continueInput variable into true so the process continues
				// every time show the above message to input again and again
				// if we don't put "continueInput = true", the process will run only for
				// one time only although the value is integer
				continueInput = true;
				System.out.println("Well Done! Continue");

				// if the user input something else instead of integer
				// then the execution domination moves toward the catch section
			} catch (InputMismatchException ex) {

				// print this line
				System.out.println("Try Again, put interger ?:");

				// change continueInput into false and stops the loop
				continueInput = false;
			}

			// Inside while loop the condition should be always true to run every time
			// but when the condition becomes false those time the loop stops. which means
			// of the while loop "if the continueInput = true" then go and run the loop
			// again or if it is false then stop
		} while (continueInput);

		input.close();
	}

}
