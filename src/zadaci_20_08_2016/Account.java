package zadaci_20_08_2016;
/* 9.7
 * (The Account class) Design a class named Account that contains:
 * A private int data field named id for the account (default 0).
 * A private double data field named balance for the account (default 0).
 * A private double data field named annualInterestRate that stores the current
 * interest rate (default 0). Assume all accounts have the same interest rate.
 * A private Date data field named dateCreated that stores the date when the account was created.
 * A no-arg constructor that creates a default account.
 * A constructor that creates an account with the specified id and initial balance.
 * The accessor and mutator methods for id, balance, and annualInterestRate.
 * The accessor method for dateCreated.
 * A method named getMonthlyInterestRate() that returns the monthly interest rate.
 * A method named getMonthlyInterest() that returns the monthly interest.
 * A method named withdraw that withdraws a specified amount from the account.
 * A method named deposit that deposits a specified amount to the account.
 * Draw the UML diagram for the class and then implement the class. (Hint: The
 * method getMonthlyInterest() is to return monthly interest, not the interest rate.
 * Monthly interest is balance * monthlyInterestRate. monthlyInterestRate
 * is annualInterestRate / 12. Note that annualInterestRate is a percentage,
 * e.g., like 4.5%. You need to divide it by 100.)
 */

import java.util.Date;

public class Account {
	
	
	//private data field
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreate;
	
	//no-arg constructor that creates a default account
	public Account() {
		dateCreate = new Date();
	}
	
	//constructor that creates an account with the specified id and initial balance.
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreate = new Date();
	}
	
	//getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public Date getDateCreate() {
		return dateCreate;
	}
	
	// returns the monthly interest rate
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 100) / 12;
	}
	//returns the monthly interest
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
	// withdraws a specified amount from the account
	public void withdraw(double amount) {
		if ((balance - amount < 0))
				System.out.println("Nedvoljan iznos na racunu.");
		else 
			balance -= amount;
	}
	//deposits a specified amount to the account
	public void deposit(double amount) {
		balance += amount;
	}	

}
