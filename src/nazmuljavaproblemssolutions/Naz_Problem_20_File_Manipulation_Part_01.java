package nazmuljavaproblemssolutions;

//May-23-2022

/*-
This program shows, how we can manipulate a file like text , documents, or folder. we can get the files
Modification date, can read or write, path, absolute path, file name , parent file name, free sapces and so
on
*/
public class Naz_Problem_20_File_Manipulation_Part_01 {

	public static void main(String[] args) {

		// create a file object for this directory file
		java.io.File file = new java.io.File("/Users/nazmulmahealam/Desktop/Java Problem Solving/Hacker "
				+ "Rank Problem Solving/Easy Soltuion/Solution 02 If else .rtf");

		java.io.File file_New_Name = new java.io.File("/Users/nazmulmahealam/Desktop/Java Problem Solving/Hacker "
				+ "Rank Problem Solving/Easy Soltuion/Solution check 02 If else .rtf");

		// when the file was last modified showing as a date and time
		java.util.Date d = new java.util.Date(file.lastModified());

		// the file is present or not
		System.out.println("Does the file exsits? : " + file.exists());

		// the length of the file
		System.out.println("The file has: " + file.length() + " Bytes");

		// is this file can read or not it is showing as true false
		System.out.println("Can we read? :" + file.canRead());

		// is this file can Write or not it is showing as true false
		System.out.println("Can we Write? : " + file.canWrite());

		// id it a folder(directory or not) showing as true or false
		System.out.println("Is it a directory? : " + file.isDirectory());

		// id it a file or not showing as true or false

		System.out.println("Is it a file? : " + file.isFile());

		// is it absolute or not
		System.out.println("Is it Absolute? :" + file.isAbsolute());

		// the file is hidden or not
		System.out.println("Is it hidden? :" + file.isHidden());

		// get the exact path
		System.out.println("Get Absolute path = " + file.getAbsolutePath());

		// printing last modified date
		System.out.println("Last MOdified : " + d);

		// getting the path
		System.out.println("Path is = " + file.getPath());

		// in which folder , the file is present is its parent path showing
		// "Easy Solution " is the parent
		System.out.println("Parent is :" + file.getParent());

		// file name
		System.out.println(" File Name: " + file.getName());

		// will rename the old file name. new name "check" is added between" "Solution"
		// and "02"
		System.out.println(file.renameTo(file_New_Name));

		// print New file Name
		System.out.println("File New Name: " + file_New_Name.getName());
		// show the path
		System.out.println("New Path for new file: " + file_New_Name.getPath());
		System.out.println("");

		///

	}

}
