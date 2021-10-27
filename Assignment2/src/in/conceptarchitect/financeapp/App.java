package in.conceptarchitect.financeapp;

import java.util.Scanner;

import in.conceptarchitect.finance.BankAccount;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String password="p@ss";
		BankAccount a1=new BankAccount(124, "krithika",password, 70000, 15);
		
		
		a1.show();		
		a1.deposit(30000);
		a1.deposit(-1.0);

		a1.show();
		
		a1.creditInterest();
		a1.show();
		
		
		a1.withdraw(50000,"wrongp@ss");
		a1.withdraw(-1, password);
		a1.withdraw(100000, password);		
		a1.withdraw(50000, password);
		
		
		
		
	}

}
