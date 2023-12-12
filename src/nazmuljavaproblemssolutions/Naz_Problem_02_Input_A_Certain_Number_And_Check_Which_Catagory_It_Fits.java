package nazmuljavaproblemssolutions;

import java.util.Scanner;

//MAY-16-2022
/*
  this program shows, how many numbers I want to take input
  then input these numbers then shows where this number fits
  such as first take input   then shows if it fits in int, short , byte, long
  then the second number shows in the same way and so on
 */
public class Naz_Problem_02_Input_A_Certain_Number_And_Check_Which_Catagory_It_Fits {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("how many times you want to input numbers ? : ");

		int num = in.nextInt();

		// this loop continues till "num" times
		// suppose if num is 5 , than it will take 5 different input from console
		for (int i = 0; i < num; i++)

		{

			// now try the below blocks
			try {

				// take input a new number
				long b = in.nextLong();

				System.out.println(b + " can be fitted in: ");
				// if number matches this conditions, than print byte
				if (b >= -128 && b <= 127) {
					System.out.println("* byte ");
				}
				// if number matches this conditions, than print short
				if (b >= -32768 && b <= 32768) {
					System.out.println("* short ");
				}

				// if number matches this conditions, than print int
				if (b >= -2147483648 && b <= 2147483647) {
					System.out.println("* int ");
				}
				// if number matches this conditions, than print long
				if (b >= Long.MIN_VALUE && b <= Long.MAX_VALUE) {
					System.out.println("* long");

				}

			} // try ends 

			// now if number is out of range of above conditions
			// than catch it as an exception and print the below line
			catch (Exception e)

			{
				System.out.println(in.next() + " can't be fitted anywhere.");
			} // catch ends 

		} // for loop ends 
		// closing the Scanner
		in.close();

	}
} // class ends 
