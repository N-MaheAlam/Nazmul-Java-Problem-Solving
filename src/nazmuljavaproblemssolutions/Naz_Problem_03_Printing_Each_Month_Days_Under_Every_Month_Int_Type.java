package nazmuljavaproblemssolutions;

import java.util.Scanner;

//MAY-16-2022

/* In this program I am going to take input month and days
then I will print month and days separately where after each month the day will be printed
output will be like
OUTPUT:
Enter total months: 3
Enter total Days: 5
===============
Month: 1
===============
Day: 1
Day: 2
Day: 3
Day: 4
Day: 5
===============
Month: 2
===============
Day: 1
Day: 2
Day: 3
Day: 4
Day: 5
===============
Month: 3
===============
Day: 1
Day: 2
Day: 3
Day: 4
Day: 5

 */

public class Naz_Problem_03_Printing_Each_Month_Days_Under_Every_Month_Int_Type {

	public static void main(String[] args) {

		// create a scanner variable inputMonth
		Scanner inputMonth = new Scanner(System.in);

		System.out.printf("Enter total months: ");
		// take a number as input which is month
		int month = inputMonth.nextInt();

		// if month is smaller or equal OR greater or equal to 13 than run the if
		// statement
		// and stop
		// if this statements are false than to go the else part
		if (month <= 0 || month >= 13) {
			System.out.println("Invalid Months");

		} else {

			System.out.printf("Enter total Days: ");

			// take a number as input which is day
			int days = inputMonth.nextInt();

			// if number is greater than 0 and smaller or equal to 12 than go to
			// the below statement
			if (month > 0 && month <= 12) {
				for (int i = 1; i <= month; i++) {

					// if the day is smaller or equal to 0 or day is greater than or equal to 32
					// than print In valid days and break the loop without continuing
					if (days <= 0 || days >= 32) {
						System.out.println("In valid Days");
						break;
					} // if ends
					System.out.println("===============");
					// print each month such as 1 than go to the below if statement
					// than again month such as 2 than to go the below statement "i" times
					System.out.println("Month: " + i);
					System.out.println("===============");

					// if day is greater or equal to 1 and day smaller or equal to 31

					if (days >= 1 && days <= 31) {
						// now print each to one by one for each month separately
						for (int j = 1; j <= days; j++) {
							System.out.println("Day: " + j);
						} // if ends

					} // ends for loop

				}
			}
		}//  line 58's, else ends 

		inputMonth.close();
	}

}
