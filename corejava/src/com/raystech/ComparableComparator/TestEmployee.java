package com.raystech.ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestEmployee {
	public static void main(String[] args) {
		
		Employee e1 =  new Employee();
		e1.setFname("James");
		e1.setLname("Richardson");
		e1.setID(10);
		
		Employee e2 =  new Employee();
		e2.setFname("Rohit");
		e2.setLname("Sharma");
		e2.setID(20);
		
		Employee e3 =  new Employee();
		e3.setFname("James");
		e3.setLname("Richard");
		e3.setID(30);
		
		ArrayList a=  new ArrayList();
		a.add(e1);
		a.add(e2);
		a.add(e3);
		
		SortingByName n= new SortingByName();
		Collections.sort(a , n);
		
		Iterator it = a.iterator();
		while(it.hasNext()){
			Object o= it.next();
			System.out.println(o);
		}
	}

} 
