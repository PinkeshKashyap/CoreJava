package com.raystec.oop;

public class Account { 
		private String number;
		private String accountType;
		private double balance;
		public double getDeposit;
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public String getAccountType() {
			return accountType;
		}
		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		public void deposit(double d){
			double dep=getBalance();
			d=d+dep;
			setBalance(d);
	}
		
		public void withdrawal(double w){
			double wid=getBalance();
			w=wid-w;
			setBalance(w);
		}
		public void fundTran(double w){
			withdrawal( w);
			
		}
		public void PayBill(double w){
			withdrawal( w);
				
		}
	
}


