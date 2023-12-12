package nazmuljavaproblemssolutions;

//MAY-18-2022

/*- 
	This program plays with the java String built in class and its some useful methods
 */
public class Naz_Problem_10_String_Class_Examples {

	public static void main(String[] args) {

		// To replace "e" and place "a" in where of "e"
		String first_Name = "Nezmul$Mahe*";

		// it will print "Nazmul$Mahe*"
		System.out.println(first_Name.replace('e', 'a'));

		// replace first "Rabbi" and place there "rabby"
		String last_Name = "#Alan$$Rabbi,Righter:Rocky;Rabbi";
		System.out.println(last_Name.replaceFirst("Rabbi", "rabby"));

		// converting a String to a String array by split specifying that after each "#"
		String[] divide_String = "NAZMUL#MAHE#ALAM#RABBI".split("#");
		for (int i = 0; i < divide_String.length; i++) {
			System.out.print(divide_String[i] + ",");

		}
		// printing false as these two names are not same
		System.out.println();
		boolean match_name = first_Name.matches(last_Name);
		System.out.println(match_name);

		// checking that each section is divided by "-" and is there 3 character in
		// first then second then 4 character of numbers.
		String phone_Number = "647-563-0878";
		System.out.println(" Will print true as first 3 is number, then 3 number " + "and last 4 is number "
				+ phone_Number.matches("\\d{3}-\\d{3}-\\d{4}"));

		// replacing all #$,:; by space
		String replace_n = last_Name.replaceAll("[#$,:;]", " ");
		System.out.println("This is the whole string not splited: " + replace_n);

		// Splitting String by specific signs {#$,:;} and putting in an array then
		// printing the value of array

		String[] change_Name = last_Name.split("[#$,:;]");

		System.out.print("This is an Array not a whole string: ");
		for (int i = 0; i < change_Name.length; i++) {
			System.out.print(change_Name[i] + " ");
		}

		System.out.println();
		String name_String = "NazmulMaheAlam";

		// Converting String to a char array then printing the value of each char array
		char[] chars = name_String.toCharArray();

		// printing each value of char array
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i] + " ");
		}

		///
	}

}