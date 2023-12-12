package nazmuljavaproblemssolutions;

//MAY-17-2022

/*-
finding maximum number from a method which has multiple numbers as arguments 
*/
public class Naz_Problem_08_Finding_Max_From_Arguments {

	public static void main(String[] args) {

		// Scanner scan = new Scanner(System.in);

		printMaxInArray(10, 4, 2, 8, 5);
		printMaxInArray(new double[] { 7, 2, 4, 8, 1, 3 });
		printMaxInArray(1, 2, 2, 1, 4, 100, 200, 50, 8, 74);
		printMaxInArray();

		//
	} // Main method

	// A method
	// here in arguments 3 dots(...) means , there can be multiple arugments in
	// this method just see the above
	// we call this methods in 3 different ways means 3 different kinds of
	// arguments
	public static void printMaxInArray(double... numbers) {

		// if there is no argument in the method
		// then it will print "No argument is give in method."
		// see the last line output in console
		if (numbers.length == 0) {
			System.out.println("No argument is given in method.");
			return;
		}

		// creating a variable where I am storing the first index of
		// "numbers"
		double result = numbers[0];

		// loop which through the each element of "numbers"
		// and increase one by one

		for (int i = 1; i < numbers.length; i++) {

			// if the value of numbers[i] index in greater than the "result"
			// then store the "numbers[i]" into result and continue unitl the
			// i value is greater than "numbers.length"
			if (numbers[i] > result)
				result = numbers[i];
		}
		// print the maximum value of the argument
		System.out.println("Max value is: " + result);

	} // printMaxInArray()

}// class
