package nazmuljavaproblemssolutions;

import java.util.Scanner;
//MAY-18-2022

/*-
  This program plays with the built in Character class
  I play here with different methods of character class such as
  getting fist character of a string, there ASCII value, taking an input
  printing each character, then separately Character and there ASCII values 
  and total ASCII values
 */

public class Naz_Problem_01_String_Breaking_Getting_ASCII_Value {

	public static void main(String[] args) {

		String c = "Good";
		// this only prints the first index of "c"
		// it prints "G"
		System.out.println(c.charAt(0));

		// this variable "d" stores the ASCII value of index 0 (71) of variable "c"
		int d = c.charAt(0);
		

		// print the ASCII value
		System.out.println(d);

		// Create a scanner variable "a" to take input from console
		// input can be int, string, char anytype
		Scanner a = new Scanner(System.in);

		// printing this line in console
		System.out.printf("Enter the name: ");

		// take input a line from console
		String b = a.nextLine();

		// this for loop prints every character of input line that we have read
		// from console
		for (int i = 0; i < b.length(); i++) {
			System.out.printf("%s   ", b.charAt(i));

		} // end loop

	
		// new line
		System.out.println();

		// this for loop prints each character and there ASCII value
		for (int j = 0; j < b.length(); j++) {
			int asciValue = b.charAt(j);
			System.out.println(b.charAt(j) + " = " + asciValue);

		} // end loop

		// new line
		System.out.println();

		// declaring "sum" variable outside of below for loop to store
		// the total sum of String that has been taken from console as input
		int sum = 0;

		// In this for loop, we are creating a variable "w" where we store each
		// character's
		// ASCII value and adding every time in "sum"
		for (int k = 0; k < b.length(); k++) {
			int w = b.charAt(k);
			sum = sum + w;

		}
		// printing the total ASCII value of "b"
		System.out.println("Ascii value of : " + b + " is " + sum);
		a.close();
		
		
		
		
	}
}
