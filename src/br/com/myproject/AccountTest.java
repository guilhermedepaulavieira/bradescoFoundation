package br.com.myproject;

public class AccountTest {

	public static void main(String[] args) {
		
		Account Account = new Account();
		Account.client = "Daniel";
		Account.balance = 4_000.00;
		Account.displayBalance();
		
//		Conta.withdraw(2000);
//		Conta.displayBalance();
//		
//		Conta.deposit(8000);
//		Conta.displayBalance();
		
		Account destiny = new Account();
		destiny.client = "Carlos";
		destiny.balance = 5_000.00;
		destiny.displayBalance();
		
		Account.transferTo(destiny, 2000.00);
		destiny.displayBalance();
		Account.displayBalance();
	}
}
