package br.com.myproject;

public class Account {

	String client;
	Double balance;
	
	void displayBalance() {
		System.out.println(client + " your balance is " + balance);
	}
	
	void withdraw(double value) {
		balance -= value;
	}
	
	void deposit(double value) {
		balance += value;
	}
	
	void transferTo(Account destino, double value) {
		this.withdraw(value);
		destino.deposit(value);
	}
	
}
