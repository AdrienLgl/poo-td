package poo.esiea.td_bank_account;

public class Account
{
	
	private double balance;
	private String holder;
	
	public Account(double balance, String holder){
		super();
		this.balance = balance;
		this.holder = holder;
	}

	public void deposit(double amount) {
		System.out.println("Depositing " + amount + " €...");
		this.balance += amount;
	}
	
	
	public void withdraw(double amount) {
		System.out.println("Withdrawing " + amount + " €...");
		this.balance -= amount;
	}
	
	public void transfer(double amount, Account account) {
		System.out.println("Transfering " + amount + " € to " + account.holder + " account...");
		try {
			this.withdraw(amount);
			account.balance += amount;
			System.out.println("Transfer completed successfully");
		} catch(Exception e) {
			System.out.println("Error during transfer, please retry later");
		}
	}
	
	public boolean isOverdrawn() {
		return this.balance < 0;
	}
	
	public double getBalance() {
		return balance;
	}
	
}
