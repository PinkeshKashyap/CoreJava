package com.raystec.collection;

public class Employee {
	private String fname;
	private String lname;
	private int employeeID;

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

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		if (o == this) {
			return true;
		}
		Employee e = (Employee) o;
		return (this.getEmployeeID() == e.getEmployeeID());
	}

	public int hashCode() {
		return getEmployeeID();
	}
} 
