package com.raystec.exception;

public class TestAccount {
	public static void main(String[] args) {
		Account ac= new Account("HDFC54275285","savings",2000.0);
		
		
		ac.withdrawl(600);
		System.out.println(ac.getbalance());
		System.out.println(ac.getaccountType());
		System.out.println(ac.getNumber());
	}

}
