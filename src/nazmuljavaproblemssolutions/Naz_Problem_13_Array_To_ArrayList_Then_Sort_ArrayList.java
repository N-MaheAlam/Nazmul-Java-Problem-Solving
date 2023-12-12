package nazmuljavaproblemssolutions;

import java.util.ArrayList;
import java.util.Arrays;

//MAY-22-2022
/*-
	This programs converts an array into arrayList and then sort the arrayList
	through collection framework
 */
public class Naz_Problem_13_Array_To_ArrayList_Then_Sort_ArrayList {

	public static void main(String[] args) {

		Integer[] array = { 15, 10, 20, 50, 2, 5, 11, 9, 5 };
		// the current unorganised array
		System.out.println(Arrays.toString(array));

		// converting array into ArrayList
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));

		// Sorting ArrayList "list"
		java.util.Collections.sort(list);

		// printing the values of "list"
		System.out.println(list);

		///
	}

}
