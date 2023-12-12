
package nazmuljavaproblemssolutions;

// May-23-2022

/*-
 	This program will show that when the user put a negative radius those time
 	how we will handle the exception
 */
class CircleWithException {

	// declare variables
	private double radius;
	private static int numberOfObjects = 0;

	// default constructor and object number increases if created
	public CircleWithException() {
		radius = 1;
		numberOfObjects++;
	}

	// Constructor with radius 's value that comes from "setRadius" setter method
	public CircleWithException(double newRadius) {
		setRadius(newRadius);
		numberOfObjects++;
	}

	public double getRadius() {
		return radius;
	}

	// if the radius is negative then IllegalArgumentException will handle it
	// as should not be negative in real life
	public void setRadius(double newRadius) throws IllegalArgumentException {

		// if radius is greater or equal to 0 then "radius" will be "newRadius"
		if (newRadius >= 0)
			radius = newRadius;

		// or if the radius is negative,IllegalArgumentException will catch it
		// and will print the below line in console
		else
			throw new IllegalArgumentException("Radius can not be negative");
	}

	// return total number of object, created by this class
	public static int getNumberOfObjects()

	{
		return numberOfObjects;
	}

	// calculate area method
	public double findArea() {
		return radius * radius * Math.PI;
	}

}

//——————
/// how to deal with the 0 divisor to not having truble ti run the program

public class Naz_Problem_19_Exception_handling_By_Radius {

	public static void main(String[] args) {

		try {
			// create an object which will call the overload constructor
			CircleWithException c1 = new CircleWithException(5);

			// it will print the area of "c1" object
			System.out.println(c1.findArea());

			// create another obeject from default constructor
			CircleWithException c2 = new CircleWithException();

			// nothing will occur till the end of try block
			CircleWithException c3 = new CircleWithException(-1);
			CircleWithException c4 = new CircleWithException(-5);

			// if there is a minus radius then catch as exception and print the method
			// "setRadius" exception handle
		} catch (IllegalArgumentException ex) {

			System.out.println(ex);
		}
		// this will be executed as how many objects are created. only 2 as
		// the two other object generates exception
		System.out.println("Number of object is: " + CircleWithException.getNumberOfObjects());

	}

}
