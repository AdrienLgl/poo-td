package poo.esiea.td_bank_account;

public class Launcher {
    public static void main(String[] args) {
    	Account jeanAccount = new Account(500000, "Jean");
    	Account rogerAccount = new Account(-56.52, "Roger");
    	System.out.println("Welcome, we are testing our bank account system with Jean and Roger accounts.");
    	System.out.println("Jean's balance: " + jeanAccount.getBalance());
    	System.out.println("Roger's balance: " + rogerAccount.getBalance());
    	System.out.println("Jean is withdrawing 500€.");
    	jeanAccount.withdraw(500);
    	System.out.println("Jean's balance: " + jeanAccount.getBalance());
    	System.out.println("Roger is depositing 10€.");
    	rogerAccount.deposit(10);
    	System.out.println("Roger's balance: " + rogerAccount.getBalance());
    	System.out.println("Jean is transfering 300€ to Roger.");
    	jeanAccount.transfer(300, rogerAccount);
    	System.out.println("Roger's balance: " + rogerAccount.getBalance());
    	System.out.println("Jean's balance: " + jeanAccount.getBalance());
    }
}
