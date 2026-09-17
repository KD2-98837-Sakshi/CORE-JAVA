package com.sunbeam;

import java.util.Scanner;

class Credit {
	private int accNo;
	private int balance;
	private int charges;
	private int credits;
	private final int creditLimit=1000;
	public Credit(int accNo, int balance, int charges, int credits) {
		this.accNo = accNo;
		this.balance = balance;
		this.charges = charges;
		this.credits = credits;
	}
	public Credit() {
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getCharges() {
		return charges;
	}
	public void setCharges(int charges) {
		this.charges = charges;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public int getCreditLimit() {
		return creditLimit;
	}
	public void acceptRecord() {
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter account no.: ");
		accNo=sc.nextInt();
		System.out.println("Enter the balance: ");
		balance=sc.nextInt();
		System.out.println("Enter the charges: ");
		charges=sc.nextInt();
		System.out.println("Enter credits: ");
		credits=sc.nextInt();
	}
}
public class Program{
	public static void main(String[] args) {
		Credit credit=new Credit();
		credit.acceptRecord();
		int newBalance=credit.getBalance()+credit.getCharges()-credit.getCredits();
		System.out.println("New Balance is: " + newBalance);
		if(newBalance>credit.getCreditLimit()) {
			System.out.println("Credit limit exceeded");
		}
	}
}
