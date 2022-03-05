package com.raystec.exception;

public class Account {
	private String number;
	private String accountType;
	private double balance;
	
	public Account(){}
	public  Account(String n, String a, double b ){
		number = n;
		accountType= a;
		balance= b;
	}
	public String getNumber(){
		return number;
	}
	public String getaccountType(){
		return accountType;		
	}
	public double getbalance(){
		return balance;
	}
	public void withdrawl (double w){
		double bal= getbalance();
		if(bal-500<w){
			InsufficientFundException e= new InsufficientFundException();
			try {
				throw e;
			} catch (InsufficientFundException e1) {
				System.out.println(e.getMessage());
			}
		}
		else bal=bal-w;
		this.balance=bal;
		
	}

		
	}
	
