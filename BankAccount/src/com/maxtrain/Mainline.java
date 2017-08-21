package com.maxtrain;

public class Mainline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Savings savings = new Savings("My first savings");
		savings.deposit(1000.00);

	    //double interest = savings.payInterest(3); // This line is going to makola.
		System.out.println(savings.display());

		/**
		 * It is good to comment.
		 */
		Account checking = new Account("My first Checking"); 

		checking.setDesc("Elisha's Checking");

		System.out.println(checking.display());
		System.out.println(savings.display());

		double newBalance = checking.deposit(100.00);
		System.out.println("Deposit $100: Balance is " + newBalance);

		newBalance = checking.deposit(100.00);
		System.out.println("Deposit $100: Balance is " + newBalance);

		newBalance = checking.deposit(75.00);
		System.out.println("Deposit $75: Balance is " + newBalance);

		newBalance = checking.withdraw(25.00);
		System.out.println("withdraw $25: Balance is " + newBalance);

		newBalance = checking.deposit(-100);
		System.out.println("Deposit -$100: Balance is " + newBalance);

		newBalance = checking.withdraw(-25);
		System.out.println("withdraw -$25: Balance is " + newBalance);

		newBalance = checking.withdraw(250);
		System.out.println("withdraw $250: Balance is " + newBalance);

		savings.transfer(200.00, checking);
		System.out.println(checking.display());
		System.out.println(savings.display());
	}

}
