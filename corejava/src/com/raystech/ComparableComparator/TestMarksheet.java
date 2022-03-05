package com.raystech.ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarksheet {
	public static void main(String[] args) {
		
		Marksheet1 m1= new Marksheet1();
		m1.setFname("Jaiveer");
		m1.setLname("Nahta");
		m1.setRollNo("15");
		m1.setPhy(95);
		m1.setChe(96);
		m1.setMath(97);
		
		Marksheet1 m2= new Marksheet1();
		m2.setFname("Pinkesh");
		m2.setLname("Kashyap");
		m2.setRollNo("19");
		m2.setPhy(94);
		m2.setChe(95);
		m2.setMath(98);
		
		Marksheet1 m3= new Marksheet1();
		m3.setFname("Pinkesh");
		m3.setLname("Arajapati");
		m3.setRollNo("21");
		m3.setPhy(85);
		m3.setChe(86);
		m3.setMath(87);
		
		
		ArrayList a= new ArrayList();
		
		a.add(m1);
		a.add(m2);
		a.add(m3);
 
		Collections.sort(a, new OrderByName());
		
		
		Iterator i=a.iterator();
		while(i.hasNext()){
			Object o= i.next();
			System.out.println(o);
		}
		
	}

}
