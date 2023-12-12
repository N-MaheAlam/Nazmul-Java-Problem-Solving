package nazmuljavaproblemssolutions;

import java.util.ArrayList;
// MAY-18-2022
/*-
	this program manipulates built in method of collection frameworks ArrayList
	Then we use ArrayList to store objects of "Course_With_ArrayList" where we finally enters 
	each object and print values or shows other stuffs which is described below 
 */

class Course_With_ArrayList {
	// variables declaring
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	// constructor with parameter "CourseName"
	public Course_With_ArrayList(String CourseName) {
		this.courseName = CourseName;
	}

	// get the Course Name
	public String getCourseName() {
		return courseName;
	}

	// get total students in array
	public String[] getStudents() {
		return students;
	}

	// get total number off students
	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	// add student through this method into the "students" array
	// whene ever a student added increase the numberOfStudents one
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	// A String representation of this class where
	// course name and number of students will be showed off
	@Override
	public String toString() {
		return courseName + " " + numberOfStudents;
	}

}

//——————————————

public class Naz_Problem_11_ArrayList_Adding_Course {

	public static void main(String[] args) {

		// create an array list which type is String
		ArrayList<String> citiList = new ArrayList<>();

		// Adding elements in citiList
		citiList.add("Dhaka");
		citiList.add("Bikrampur");
		citiList.add("Munshiganj");
		citiList.add("Narayganj");
		citiList.add("Gazipur");
		citiList.add("Savar");

		// Checking the size or ArrayList
		System.out.println("List Size? : " + citiList.size());

		// Checking if Chadpur is present or not
		System.out.println("Is there Chadpur present? : " + citiList.contains("Chadpur"));
		// Getting the index number of Gazipur
		System.out.println("Gazipur is in number: " + citiList.indexOf("Gazipur"));
		// Checking Whether the citiList is empty or not
		System.out.println("Is the list empty? : " + (citiList.isEmpty()));

		System.out.println("Total 6 elements: " + citiList.toString());

		// Adding Comilla index 3 but nor removing the exixting element
		// in index 3 . it will increase also the array size. we use remove
		// to
		// citiList.
		citiList.add(3, "Comilla");
		System.out.println("total 7 elements : " + citiList.toString());

		// "Dhaka" will be replaced bye "Chottogram"
		citiList.set(0, "Chottogram");
		System.out.println("Replace Dhaka to Chottogram: " + citiList.toString());

		// Removing Savar from the Array Object list
		citiList.remove("Savar");
		System.out.println("Without Savar ArrayList: " + citiList.toString());

		// Adding Mirpur to the Array List
		citiList.add(3, "Mirpur");
		System.out.println(citiList.toString());

		// Printing in reverse order each ArrayList components
		System.out.print("Reverse Array: ");
		for (int i = citiList.size() - 1; i >= 0; i--)
			System.out.print(citiList.get(i) + " ");

		System.out.println();
		// Printing in list order, order each ArrayList components
		for (int i = 0; i < citiList.size(); i++)
			System.out.print(citiList.get(i) + " ");

		System.out.println();

		ArrayList<Course_With_ArrayList> courseList = new ArrayList<>();

		courseList.add(new Course_With_ArrayList("DataBase"));
		courseList.add(new Course_With_ArrayList("Java"));
		courseList.add(new Course_With_ArrayList("Spring Boot"));
		courseList.add(new Course_With_ArrayList("J2EE"));

		System.out.println(courseList.toString());

		System.out.println("The First Course is: " + courseList.get(1).getCourseName());
		System.out.println("Total students in Course: " + courseList.get(2).getNumberOfStudents());
		System.out.println("Course and number of students are: " + courseList.get(3).toString());

		// Adding students in index 1, which means in index 1 , we have an object which
		// "Course" is "Java".
		// now specifically I am adding "students" on that
		courseList.get(1).addStudent("Nazmul");
		courseList.get(1).addStudent("Mahe");
		courseList.get(1).addStudent("Alam");
		System.out.println("Index 1 is printing as toString as it is" + "an object " + courseList.get(1).toString());

		// whenever we add a student by calling "addStudent" method
		// it goes to "students" array directly and increase numberOfStudents one each
		// time.
		// Now, create a string array variable , use the "courseList" object , get into
		// the
		// index 1 where an object "Java" course name is created and get the total
		// students
		// number from there.
		String[] student1 = courseList.get(1).getStudents();

		// run a for loop and continues till i is less then courseList index 1 of
		// getNumberOfStudents size
		for (int i = 0; i < courseList.get(1).getNumberOfStudents(); i++) {

			// now print each value of student1 array wich we have collect from

			System.out.print(student1[i] + " ");
		}
		///
	}

}
