package com.raystec.collection;

public class TestEmployee {
	public static void main(String[] args) {
		
		Employee e1= new Employee();
		e1.setEmployeeID(20);
		e1.setFname("pinkesh");
		e1.setLname("Kashyap");
		
		Employee e2 = new Employee();
		e2.setEmployeeID(20);
		e2.setFname("pinkesh");
		e2.setLname("kashyap");
		
		System.out.println("Shallow Comparision: "+ (e1==e2));   // it compares the memory location where the address stores
		
		System.out.println("Deep Comparision: "+ (e1.equals(e2))); // it compares the internal details too like hashcode.
		
		System.out.println(e1.hashCode()==e2.hashCode());
		System.out.println(e2.hashCode());
		
	}
   
	
}
