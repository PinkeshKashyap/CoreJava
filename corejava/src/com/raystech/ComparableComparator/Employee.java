package com.raystech.ComparableComparator;

public class Employee {
	
	private String fname;
	private String lname;
	private int ID;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	public String toString() {
		return fname+ "," + lname + "," + ID;
		

	}
	

}
