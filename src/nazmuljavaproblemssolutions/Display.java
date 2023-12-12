 package nazmuljavaproblemssolutions;

import java.io.IOException;

//May-23-2022

/*-
This program shows, how we can manipulate a file like text , documents, or folder. we can get the files
Modification date, can read or write, path, absolute path, file name , parent file name, free sapces and so
on
*/
public class Display {

	public static void main(String[] args) throws IOException {

		// to manipulate a file or a folder or anything first we have to declare it
		// in "File" class I & this is a folder in mac as it has a ".rtf" extension
		java.io.File a_Demo_File = new java.io.File("/Users/nazmulmahealam/Desktop/File_example01.rtf");

		// "date_Of_File" variable is a Date type where we store the last modification
		// time
		// of "a_Demo_File".
		java.util.Date date_Of_File = new java.util.Date(a_Demo_File.lastModified());
		

		// print the last modified date
		System.out.println("The file was last modified: " + date_Of_File);

		// this file can read or not print it as true or false
		System.out.println("The file can read? : " + a_Demo_File.canRead());

		// this file can write or not just print it as true or false
		System.out.println("The File can write? : " + a_Demo_File.canWrite());

		System.out.println("The absoulate path of the file: " + a_Demo_File.getAbsolutePath());
		System.out.println("Canoncial path: " + a_Demo_File.getCanonicalPath());
		System.out.println("Space left for the file in Bytes: " + a_Demo_File.getFreeSpace());
		System.out.println("The file name is: " + a_Demo_File.getName());

		// it print the folder path where the file is located . see here is path shown
		// with
		// this file name. last part is the file's folder name "Desktop"
		System.out.println("Get the parent directory: " + a_Demo_File.getParent());

		// this is the regular path of the file
		System.out.println("This is the regular path of the file: " + a_Demo_File.getPath());
		System.out.println("Show total space in file: " + a_Demo_File.getTotalSpace());
		System.out.println("Get the useable space: " + a_Demo_File.getUsableSpace());
		System.out.println("Get the hash value: " + a_Demo_File.hashCode());

		System.out.println("Is it a directory? : " + a_Demo_File.isDirectory());
		System.out.println("is it absolute? : " + a_Demo_File.isAbsolute());
		System.out.println("is it a file? : " + a_Demo_File.isFile());
		System.out.println("is the file is hidden? : " + a_Demo_File.isHidden());

		// it will not show as time and date . To see as a time and date, we have to
		// store it in
		// java.io.Date type variable
		System.out.println("Last modification? : " + a_Demo_File.lastModified());
		System.out.println("Length of the file " + a_Demo_File.length());
		
		// print true as it is a folder not any other file type like .txt, .img, 
		System.out.println("" + a_Demo_File.mkdir());

	} // Main method

}// class
