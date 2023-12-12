package nazmuljavaproblemssolutions;

// MAY-17-2022

/*-
	This program create a course class where it declares course name, students, students name
	also. and a main class is used to create two different objects and from these objects
	we calculate the enrolled students and print everyones name
 */
class Course_For_Students {

	// declare course name
	private String courseName;

	// declare the students array to store the students
	private String[] students = new String[100];

	// total number of students
	private int numberOfStudents;

	// constructor which have a parameter
	public Course_For_Students(String CourseName) {
		this.courseName = CourseName;
	}

	// get the course name
	public String getCourseName() {
		return courseName;
	}

	// return the total students array
	public String[] getStudents() {
		return students;
	}

	// return total number of students
	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	// by calling this method we will add "student" and we have to call this method
	// by creating object as it is not a static method.
	// only static method can be called by class name without any object creation
	// adding this "student" every time in "numberOfStudents" index of "students"
	// variable and increase the value of "numberOfStudents" when we add a new
	// "student"
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

}

public class Naz_Problem_09_Adding_Course_Students_Through_Object {

	public static void main(String[] args) {

		// creating an object with the course name java
		Course_For_Students course1 = new Course_For_Students("Java");
		// creating an object with the course name SQL
		Course_For_Students course2 = new Course_For_Students("SQL");

		// add student one by one using "course1" and call the method
		// "addStudent"
		course1.addStudent("Nazmul");
		course1.addStudent("Mahe");
		course1.addStudent("Alam");

		// add student one by one using "course2" and call the method
		// "addStudent"
		course2.addStudent("Manik");
		course2.addStudent("Shahin");
		course2.addStudent("Lutfor");
		course2.addStudent("Mehedi");

		// print course name and total student in "course1"
		System.out.println(
				"Number of Students is Course " + course1.getCourseName() + " is : " + course1.getNumberOfStudents());
		System.out.print("The Name of the students are: ");

		// declare a string array "student1"
		String[] student1 = course1.getStudents();

		// run a for loop length will be the total number of students added in
		// "course1" not the
		// array we declared as private String[100], because if we use this array as
		// condition it will print the 100 values included the null values in the
		// "students"
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(student1[i] + ",");
		System.out.println("\n");

		// just same as above but only it will be course2 and student2
		System.out.println(
				"Number of Students is course " + course2.getCourseName() + " is : " + course2.getNumberOfStudents());
		System.out.print("The Name of the Students are: ");
		String[] student2 = course2.getStudents();
		for (int i = 0; i < course2.getNumberOfStudents(); i++)
			System.out.print(student2[i] + ",");

		///
	}

}
