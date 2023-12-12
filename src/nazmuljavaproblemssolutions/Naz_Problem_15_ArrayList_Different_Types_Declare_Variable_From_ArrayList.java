package nazmuljavaproblemssolutions;

import java.util.ArrayList;
import java.util.List;

//MAY-22-2022

/*-
	This program stores different types of values in a List and in variable ,
	I give there types which one is I need, depend on this.
	String type ArrayList and Integer type ArrayList printing are shown in
	below
 */
public class Naz_Problem_15_ArrayList_Different_Types_Declare_Variable_From_ArrayList {

	public static void main(String[] args) {

		List names = new ArrayList<>();

		// Adding values of different but there type is not declared
		names.add(100);
		names.add("Nazmul Mahe Alam");
		names.add(1181442);
		names.add("Feroz Alam");

		// print all the values in list
		System.out.println("Print all the values in names: " + names);
		System.out.println();

		// converting index 0 into an Integer type and storing in a "in"
		// variable
		Integer in = (Integer) names.get(0);

		// print "in"
		System.out.println("Print the Integer type value: " + in);

		// converting index 1 into a String type and storing in a "str" variable
		String str = (String) names.get(1);
		System.out.println();

		// print "str"
		System.out.println("Print the String type value: " + str);
		System.out.println();

		// Declaring a List of String which is an ArrayList
		// which mean the List can use all the implemented method of List which are
		// implemented in ArrayList but not the all methods of ArrayList only that
		// have come from the List parent to child ArrayList
		List<String> familyNames = new ArrayList<String>();

		// Adding values in "familyNames"
		familyNames.add("Feroz");
		familyNames.add("Righter");
		familyNames.add("Rocky");
		familyNames.add("Rabbi");
		familyNames.add("Anondo");
		familyNames.add("Utsob");

		// printing "familyNames"
		System.out.println(familyNames);

		// An Integer type ArrayList declaration
		ArrayList<Integer> count = new ArrayList<Integer>();
		count.add(10);
		count.add(20);
		count.add(30);
		count.add(40);
		count.add(50);

		// storing index 0 value into "int1" which is an Integer type variable
		// same type as ArrayList "count" type , in the same way I stored index 1,2
		// values in "int2" "int3" respectively
		Integer in1 = count.get(0);
		Integer in2 = count.get(1);
		Integer in3 = count.get(2);
		System.out.println();

		// printing the values of "count" ArrayList
		System.out.println(count);
		System.out.println();

		// printing each value of "in1, in2, in3" respectively
		System.out.println(in1);
		System.out.println(in2);
		System.out.println(in3);
		System.out.println();

		///
	}

}
