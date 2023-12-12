package nazmuljavaproblemssolutions;

import java.util.ArrayList;
import java.util.Iterator;

//MAY-22-2022
public class Naz_Problem_16_ArrayList_Two_Manupulation {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		ArrayList<Integer> list2 = new ArrayList<>();

		// Adding value in list
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);

		// Adding value in list2
		list2.add(11);
		list2.add(22);
		list2.add(33);
		list2.add(44);
		list2.add(55);
		list2.add(66);
		list2.add(77);
		list2.add(88);
		list2.add(99);
		list2.add(999);

		System.out.println("Print list: " + list);
		System.out.println("Print list2: " + list2);

		list2.add(8765);
		list.add(111);

		// Adding all value of list in list2
		list2.addAll(list);

		// printing updated value of list2 (this LIST consist of the updated value of
		// list
		System.out.println("Adding all values from list to list2: " + list2);

		// Creating a same ArrayList like list
		ArrayList<Integer> newCloneList = (ArrayList<Integer>) list.clone();

		// printing original "list"
		System.out.println("This is original list: " + list);

		// printing the clone of "list"
		System.out.println("This is a clone of list: " + newCloneList);

		// checking with contains API Method
		// prints the else statement as their values are same but they are not same
		if (list.contains(newCloneList)) {
			System.out.println("They have the same copy");
		} else {
			System.out.println("They are not same although there elements are same");
		}

		// checking if 90 present in "list" then print true or else print false
		// it will print true
		System.out.println("Prints true: " + list.contains(90));

		// Checking that 66 is present or not[66 is present ]
		if (list2.contains(66)) {
			System.out.println("Yes 66 is present");

		}

		// it will show "Yeah" because not its checking All the elements using
		// "containsAll" method
		if (list.containsAll(newCloneList)) {
			System.out.println("Yeah");
		} else {
			System.out.println("no");
		}

		// prints "true" as they are same in type and same number of elements consist
		System.out.println("list and newCloneList are equal: " + list.equals(newCloneList));

		// As they don't have the same elements as well as they are not same
		System.out.println("list2 and list is not same bro: " + list2.equals(list));

		System.out.print("print all elements of list: ");
		// printing each value of list2
		list.forEach(e -> System.out.print(e + "||"));
		System.out.println();

		System.out.print("print all elements of list2: ");

		// print each element of list
		list2.forEach(s -> System.out.print(s + "=="));
		System.out.println();

		System.out.print("print all elements of newCloneList: ");

		// print each element of list
		newCloneList.forEach(x -> System.out.print(x + ">>>"));
		System.out.println();

		// store index 8 value in "a"
		int a = list.get(8);

		// Pinting a value
		System.out.println("print a value: " + a);

		// store index b value in "a"
		int b = list2.get(7);

		// print b
		System.out.println(b);

		// print class name of list where it is situated
		System.out.println("Class name of list2: " + list2.getClass());

		// print class name of list2 where it is situated
		System.out.println("Class name of list: " + list.getClass());

		System.out.println("Hash value of list: " + list.hashCode());

		// return false as the list is not empty
		System.out.println("list is not empty,so false?: " + list.isEmpty());

		// It prints something like instance
		System.out.println("Print iterator value: " + list.iterator());

		// prints the first element
		System.out.println("1st index value of list: " + list.iterator().next());

		// checks and returns true false if there is any element next or not
		System.out.println(
				"If there is element after the 1st index, then" + " print true?: " + list.iterator().hasNext());

		// Iterator class help us to create an instance by which we can call one by one
		// value of "list"
		Iterator iterateList = list.iterator();

		// print 10
		System.out.println("1st value of list: " + iterateList.next());

		// print 20
		System.out.println("2nd value of list: " + iterateList.next());

		// print 30
		System.out.println("3rd value of list: " + iterateList.next());

		// some java value may be printing I will figure it out no worries
		System.out.println(list.listIterator());

		// prints the last occurrence of 90 [in list it is in 8 number index]
		System.out.println("Print the index number of 90 in list: " + list.lastIndexOf(90));

		// prints the last occurrence of 999 [in list it is in 9 number index]
		System.out.println("Print the index number of 90 in list2: " + list2.lastIndexOf(999));

		// it prints the Integer as String
		System.out.println("list2 as string: " + list2.toString());

		// Print the size or list
		System.out.println("Size of list2" + list2.size());

		// before removing 90 from list
		System.out.println(list);

		// removes 90 if it exits in "list"
		list.removeIf(n -> (n == 90));

		// After removing 90 from "list"
		System.out.println("After removing 90 from list: " + list);

		// before removing 111 from "list2"
		System.out.println("Before removing 111 from list2: " + list2);

		// removes 111 from "list2"
		list2.removeIf(n -> (n == 111));

		// after removing 111 from list2
		System.out.println("After removing 111 new list2: " + list2);

		// removes index 10
		list2.remove(10);

		// updated list2
		System.out.println("After removing index 10: " + list2);

		// setting index 9[999] into 0
		list2.set(9, 000000);

		// updated
		System.out.println("New list2 after set up 9 index into 000000: " + list2);

		// setting index 7 into 788990000
		list.set(7, 788990000);
		System.out.println("New list after set up 9 index into 000000: " + list);

		/////
	}
}
