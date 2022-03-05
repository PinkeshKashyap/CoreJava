package com.intrfc;

public class Businessman extends Person implements SocialWorker,Richman {

	@Override
	public void earnMoney() {
		// TODO Auto-generated method stub
		System.out.println("We are earning money");
	}

	@Override
	public void donation() {
		// TODO Auto-generated method stub
		System.out.println("giving Donation");
	}

	@Override
	public void party() {
		// TODO Auto-generated method stub
	System.out.println("Richman doing party");
	}

	@Override
	public void helpToOthers() {
		// TODO Auto-generated method stub
		System.out.println("to help others");
	}
//	public static void main(String[] args) {
//		SocialWorker b=new Businessman();
//		b.helpToOthers();
	}


