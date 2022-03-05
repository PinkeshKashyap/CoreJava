package com.intrfc;

public class Person2 {
	private String fname;
	private String lname;
	private String address;

	public Person2(){
		System.out.println("default Constructor is called ");
	}

	public Person2(String fname, String lname){
		System.out.println("Constructor with 2 parameter called");
	}
	public Person2(String fname,String lname, String address){
		System.out.println("Constructor with 3 parameter called ");
	}
/*	public static void main(String[] args) {
		Person1 p=new Person1("Pinkesh","Kashyap","Banganga");
		System.out.println();
	}*/
}
