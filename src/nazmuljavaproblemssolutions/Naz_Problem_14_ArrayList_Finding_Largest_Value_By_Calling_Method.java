package nazmuljavaproblemssolutions;

import java.math.BigInteger;
import java.util.ArrayList;

//MAY-22-2022

/*-
	This program helps to find the largest Number in an ArrayList
	by building a method 
 */

public class Naz_Problem_14_ArrayList_Finding_Largest_Value_By_Calling_Method {

	// This static method take input an ArrayList and return the largest
	// number into that ArrayList. We use static keyword in a method so that
	// we can call this method without creating any object , can call only by
	// the class name

	// return type Number parameter ArrayList which is Number type
	public static Number getLargestNumber(ArrayList<Number> a) {

		// if ArrayList is empty or null then return null
		if (a.isEmpty() || a == null)
			return null;

		// if the ArrayList is not null or empty which means it has values inside
		// it
		// now put the 1st index of arrayList into the "num" variable
		Number num = a.get(0);

		// run a for loop till the last index of ArrayList and increase one by
		// one.
		for (int i = 0; i < a.size(); i++)

			// if the "num" value is smaller than the "i" index value of every time
			// when the loop continues then the"num" value becomes into new value of
			// "i" index and return "num". this process continues till the last index
			// of ArrayList and until it gets the largest number among all the index
			if (num.doubleValue() < a.get(i).doubleValue())
				num = a.get(i);
		return num;
	}

	public static void main(String[] args) {

		// Create an ArrayList which is Number type
		ArrayList<Number> checkList = new ArrayList<>();

		// Returns "true" as there is no value in new ArrayList
		System.out.println(checkList.isEmpty());

		// now add value in "checkList"
		checkList.add(45);
		checkList.add(123.04);

		// adding value by calling the "BigInteger" built in class which is a
		// form of object
		checkList.add(new BigInteger("3445566776544333"));
		checkList.add(new BigInteger("234343343434343343434343"));

		// print all the values in "checkList"
		System.out.println(checkList);

		// call the "getLargestNumber" method and print the largest number
		// into this ArrayList
		System.out.println("Largest Number is: " + getLargestNumber(checkList));

	}

}
