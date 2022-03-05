package com.intrfc;

public class Employee extends Person2 {

	private String designation;
	
	public Employee(){
		super();
		System.out.println("This is a default Constructor of Employee");
}
	public Employee(String fname, String lname){
		super(fname,lname);
		System.out.println("This is employee Constructor with 2 parameters");
	}
	public Employee(String fname, String lname, String designation){
		super(fname,lname,designation);
		System.out.println("This is a employee constructor with 3 parameters");
	}
	
	
	
	public static void main(String[] args) {
		
		Employee e=new Employee("pinkesh","Kashyap", "pinkl");
	}
}