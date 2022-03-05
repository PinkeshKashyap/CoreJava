package com.oopAssignment;

public  class BusinessMan implements Richman {

	@Override
	public void donation() {
		// TODO Auto-generated method stub
		int donation= 1000+2000;
		System.out.println("Businessman doing donation of " + donation);
		
	}

	@Override
	public void party() {
		// TODO Auto-generated method stub
		int party = 1500-200;
		System.out.println("businessman doing party of "+ party);
		
	}


	

}
