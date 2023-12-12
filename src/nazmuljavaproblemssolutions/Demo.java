
package nazmuljavaproblemssolutions;

// May-23-2022

import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {

		// Creating a file object
		java.io.File createNewFile = new java.io.File("/Users/nazmulmahealam/Desktop/Naz_Details.txt");

		// if the file is there exit
		if (createNewFile.exists()) {
			System.out.println("Already the file there. Use Another Name");
			
			System.exit(1);
		} // end if
			// other wise create file with this name "Naz Details.txt"
		java.io.PrintWriter printNazDetails = new java.io.PrintWriter(createNewFile);

		// the below each line will be printed in the "Naz_Details.txt" which in destop
		printNazDetails.println("Name: Nazmul Mahe Alam");
		printNazDetails.println("Email: nmahealam@gmail.com");
		printNazDetails.println("Phone: +16475630878");
		printNazDetails.println("Address: 20 August Ave,Toronto, Ontario");
		printNazDetails.close();
		
		// If there is no file then the file will be created, will be loaded with 
		// above "printNazDetails" line the it will print the successful line below.
		System.out.println("Successfully done");
		

		///

	}

}
