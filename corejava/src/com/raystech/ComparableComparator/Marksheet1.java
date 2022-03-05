package com.raystech.ComparableComparator;

public class Marksheet1 {
	
	private String rollNo;
	private String fname;
	private String lname;
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

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	private int phy;
	private int che;
	private int math;
	
	public Marksheet1(){}


	public int getPhy() {
		return phy;
	}

	public void setPhy(int phy) {
		this.phy = phy;
	}

	public int getChe() {
		return che;
	}

	public void setChe(int che) {
		this.che = che;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	public String toString(){
		return rollNo + " " + fname + " " + lname + " "+ phy + " "+ che+ " "+ math;
	}
	

	
			}