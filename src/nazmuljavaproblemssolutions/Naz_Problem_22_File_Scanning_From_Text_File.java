package nazmuljavaproblemssolutions;

//May-23-2022
/*
	This program shows how  we can read text from a file and how can we 
	print each line in console
*/
import java.io.IOException;
import java.util.Scanner;

public class Naz_Problem_22_File_Scanning_From_Text_File {

	public static void main(String[] args) throws IOException {

		// A certain file path storing in "txt" to manipulate
		java.io.File txt = new java.io.File("/Users/nazmulmahealam/Desktop/Java Problem Solving/File_example01.rtf");

		// scan every thing in txt file type variable
		Scanner readTxt = new Scanner(txt);

		// if readTxt has next line, then every time it will collect
		// each line in "readLine" variable and print every time. this
		// loop will continue until there is no line found in file
		while (readTxt.hasNext()) {
			String readLine = readTxt.nextLine();
			System.out.println(readLine);
		}
		readTxt.close();

	}

}
