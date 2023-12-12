package nazmuljavaproblemssolutions;

//MAY-17-2022

/*-
	This program calculates the interest such as takes input as interest rate, years and loan amounts
	& shows monthly payment and total amount with interest
 */
import java.util.Scanner;

public class Naz_Problem_06_Monthly_Interest_Main_Class {

	public static void main(String[] args) {

		// create a scanner object to scan from the console
		Scanner scan = new Scanner(System.in);

		// Scan the interest rate
		System.out.print("Enter the Annual Interest Rate: ");
		double annualInterestRate = scan.nextDouble();

		// scan the number of years
		System.out.print("Enter the number of years: ");
		int numberOfyears = scan.nextInt();

		// scan the loan amount
		System.out.print("Enter Loan Amount you want: ");
		double loanAmount = scan.nextDouble();

		// create a loan object which is Naz_Problem_06_Loan_Derive_Class type
		// where we used the overloaded constructor and as parameter we use the
		// above variables
		Naz_Problem_06_Loan_Derive_Class loan = new Naz_Problem_06_Loan_Derive_Class(annualInterestRate, numberOfyears,
				loanAmount);

		// calling geLoanDatet() method and converting it in string as it it called by
		// the
		// object "loan"
		// "%s" is used to show something in out put as String as it comes from a
		// variable or
		// from a method , I mean derived from something
		// ".2f or .3f is used because after decimal point , I want numbers such as
		// 29.999 and 50.10 respectively
		System.out.printf(
				"the loan was created on %s\n" + " The montly Payment is: %.3f \n The total pyament is : %.2f\n",
				loan.geLoanDatet().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
		scan.close();

	}
}
