package zadaci_20_08_2016;
/* Write a test program that creates an Account object with an account ID of 1122,
 * a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw
 * method to withdraw $2,500, use the deposit method to deposit $3,000, and print
 * the balance, the monthly interest, and the date when this account was created.
 */

public class TestAccount {

	public static void main(String[] args) {
		
		//kreiranje objekta sa pocetnim vrijednostima
		Account account = new Account(1122,20000);
		account.setAnnualInterestRate(4.5);
		
		//ispis detalja racuna
		System.out.println("ID: "+account.getId());
		System.out.println("Datum kreiranja racuna: "+account.getDateCreate());
		System.out.println("Balance: "+account.getBalance());
		System.out.println("Mjesecna kamata: "+account.getMonthlyInterest());
		
		System.out.println("\nIsplata 2500");		//isplata, poziv metode i ispis novih detalja
		account.withdraw(2500);		
		System.out.println("Balance: "+account.getBalance());
		System.out.println("Mjesecna kamata: "+account.getMonthlyInterest());
		
		System.out.println("\nUplata 3000");		////iuplata, poziv metode i ispis novih detalja
		account.deposit(3000);
		System.out.println("Balance: "+account.getBalance());
		System.out.println("Mjesecna kamata: "+account.getMonthlyInterest());

	}

}
