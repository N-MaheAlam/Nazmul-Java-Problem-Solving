package nazmuljavaproblemssolutions;

//MAY-17-2022
/*-
  this program use the StringBuilder class and its method which has some 
  string features then String class
 */
public class Naz_Problem_05_StringBuilder_Example {

	// StringBuilder class has some extra features like
	// reverse a string, delete, insert, Capacity of the object
	// and so many things
	public static void main(String[] args) {

		StringBuilder b = new StringBuilder("123");

		// print the value of String object "b"
		System.out.println("Value = " + b);

		// connects "b(123) with "456".
		// output "123456"
		b.append("456");
		System.out.println("Appending the value 456 = " + b);

		// connects "b(123456) with "789".
		// output "123456789"
		b.append("789");
		System.out.println("Appending 789 to new string object = " + b);

		// as there are 9 index from 0 to index 8
		// from index 9 it starts to add "ABC"
		//
		b.insert(9, "ABC");
		System.out.println("Inserting the value from 9 pposition = " + b);

		// now from index 1 , it removes everything till index number 8
		// as there are 9 elements from index 0 to 8 it removes from index 1 to 8
		b.replace(1, 9, "DEF");
		System.out.println("replacing from index 1 to 9 position = " + b);

		// it delets from index 0 & 1 which is total 2 elements
		b.delete(0, 2);
		System.out.println("replacing from 0 index to till 2nd element = " + b);

		b.reverse();
		System.out.println("Reversing the index = " + b);
	
	}

}
