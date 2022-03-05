package com.intrfc;

import java.util.Date;

public class Person {

	private String name;
	private String address;
	private Date dob;
	public static final int AvgAge=50;
	
	
	public void Setname(String n){
		name=n;
	}
	public String getname(){
		return name;
	}
	
	
	public void Setaddress(String a){
	address=a;
	}
	public String getaddress(){
		return address;
	}
	
	
	public Date getDob() {
		return dob;
	}
	public void SetDob(Date i) {
		this.dob = i;
	}
	
	
	public static int getAvgAge(){
		return AvgAge;
	}
	
}
