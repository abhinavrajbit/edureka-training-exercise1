package com.abhinav.exercise2;

import java.util.Scanner;

public abstract class Account {
	int accountNumber;
	String name;
	double amount;
	
	public Account(int accountNumber, String name,double amount) {
		this.accountNumber =accountNumber;
		this.name = name;
		this.amount = amount;
	}
	
	abstract void deposit(double amount);
	abstract double withdraw(double withdrawAmount);

}


class Saving extends Account {

	public Saving(int accountNumber, String name, double amount) {
		super(accountNumber, name, amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	void deposit(double amount) {
		amount = + amount;
		
	}

	@Override
	double withdraw(double withdrawAmount) {
		// TODO Auto-generated method stub
		double res = amount - withdrawAmount;
		System.out.println("Amount after deduction is : "+ res);
		return amount =- withdrawAmount;
	}
	
	
}





class Current extends Account {

	public Current(int accountNumber, String name, double amount) {
		super(accountNumber, name, amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	void deposit(double depositAmount) {
		double res = amount + depositAmount;
		System.out.println("Amount after deduction is : "+ res);
		
	}

	@Override
	double withdraw(double withdrawAmount) {
		// TODO Auto-generated method stub
		double res = amount - withdrawAmount;
		System.out.println("Amount after deduction is : "+ res);
		return amount=-withdrawAmount;
	}
	
}

class main {
	
	
	public static void main(String args[]) {
		System.out.println("Press 1 for Saving account and Press 2 for Current Account :\n");
		Scanner sc = new Scanner(System.in);
		int press = sc.nextInt();
		if(press==1) {
			Saving savingAccount = new Saving(142545,"Abhinav", 200000);
		}
		if(press==2) {
			Current currentAccount = new Current(545244,"raj",200000);
		}
		
	}
}
