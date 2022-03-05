package com.raystec.oop;

public class TestAccount {
	public static void main(String[] args) {
		
		Account a=new Account();
		a.setNumber("9977042700");
		a.setAccountType("Saving");
		
		a.setBalance(10000);
		System.out.println(a.getBalance());
		a.deposit(5000);
		System.out.println(a.getBalance());
		a.fundTran(2000);
		System.out.println(a.getBalance());
		a.withdrawal(2000);
		System.out.println(a.getBalance());
		a.PayBill(500.00);
		System.out.println(a.getBalance());
	}

}
