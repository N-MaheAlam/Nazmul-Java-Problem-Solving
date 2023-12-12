package nazmuljavaproblemssolutions;

//MAY-17-2022
/* -
	This program Declares all the variable and method to  calculate total
	monthly payment after interest and the total amount till "n" years 
 */
public class Naz_Problem_06_Loan_Derive_Class {

	// Variable for annual interest
	private double annualInterestRate;

	// variable number of years you want loan
	private int numberOfyears;

	// amount of loan you want
	private double loanAmount;
	// creating a date variable derive from util package and "Date" buit in class

	private java.util.Date loanDate;

	// default constructor and declaring the amount for that
	public Naz_Problem_06_Loan_Derive_Class() {
		this(2.5, 1, 1000);
	}

	// Overloading constructor
	public Naz_Problem_06_Loan_Derive_Class(double annualInterestRate, int numberOfyears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfyears = numberOfyears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}

	// get the annual interest rate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	// set the annual interest rat
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	// get the years
	public int getNumberOfyears() {
		return numberOfyears;
	}

	// set the years
	public void SetNumberOfyears(int numberOfyears) {
		this.numberOfyears = numberOfyears;
	}

	// set the loan amount
	public double getLoanAmount() {
		return loanAmount;
	}

	// set the loan amount
	public void SetLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	/// get the date which is java.util.Date type
	public java.util.Date geLoanDatet() {
		return loanDate;
	}

	// calculating monthly payment
	public double getMonthlyPayment() {
		{
			double monthlyInterestRate = annualInterestRate / 1200;
			double monthlyPayement = loanAmount * monthlyInterestRate
					/ (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfyears * 12)));
			return monthlyPayement;
		}
	}

	// get the total amount with the interest
	public double getTotalPayment()

	{
		double totalPayment = getMonthlyPayment() * numberOfyears * 12;
		return totalPayment;
	}

}
