package nazmuljavaproblemssolutions;

import java.util.Scanner;

//MAY-22-2022

/*- 
*  This program is about how to deal with the 0 divisor to not having 
*  trouble it run the program and how to handle exception
*/
public class Naz_Problem_17_Exception_Handling_Divisor_0 {

	public static void main(String[] args) {

		// create a scanner
		Scanner in = new Scanner(System.in);

		// print this line
		System.out.println("Enter two integers: ");

		// take input b as an integer from console
		int b = in.nextInt();

		// take input c as an integer from console
		int c = in.nextInt();

		// now try the below section if there is no error from user input
		try {
			int res = quotient(b, c);
			System.out.println(b + " / " + c + " is " + res);

		}
		// if any exception I mean any unwanted problem arise such as 0 as divisor
		// catch as an exception and print the below line
		catch (ArithmeticException ex) {
			System.out.println(ex);
		}
		in.close();

	} // main method ends

	public static int quotient(int a, int b) {
		// if the condition is true then this line suppose to be showed up
		// but as we have declared an catch block then the catch block will be
		// showed up instead of this exception.

		// but if we don't modify the catch block and use "ex" as a parameter
		// in catch then the below line will be printed in catch block. just
		// check the out put
		// but if we don't declare try and catch block then this line will come up
		// in console and will show as an error line
		if (b == 0)
			throw new ArithmeticException("Divisor can not be zero");

		return a / b;

	} // quotient method ends

}// class ends
