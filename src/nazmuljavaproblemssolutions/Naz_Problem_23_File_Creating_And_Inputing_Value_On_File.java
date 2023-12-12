package nazmuljavaproblemssolutions;

import java.io.IOException;

public class Naz_Problem_23_File_Creating_And_Inputing_Value_On_File {

	public static void main(String[] args) throws IOException {
		java.io.File file_Path_Details = new java.io.File("/Users/nazmulmahealam/Desktop/Naz Details.txt");

		// if the file is present in computer then show this message
		if (file_Path_Details.exists()) {
			System.out.println("The file is already in desktop. I am deleting the file");
			file_Path_Details.delete();

			// exit(1) or any number inside the exit
			// is used when termination is unsuccessful and exit(0) is used
			// when termination is successful.
			System.exit(1);
		} // if ends

		java.io.PrintWriter input_In_File = new java.io.PrintWriter(file_Path_Details);

		// Wrinting or printing all these values into that "file_Path_Details" file
		input_In_File.println("Name: Nazmul Mahe Alam");
		input_In_File.println("Phone: +16475630878");
		input_In_File.println("Address: 20 August Ave, Toronto, Scarborugh, Ontario");
		input_In_File.close();
		System.out.println("Successfully created ");

	} // main method ends
} // classe ends
