package com.raystech.ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestMarksheetSorting {
	public static void main(String[] args) {
		
		ArrayList marksheets= new ArrayList();
		
		marksheets.add(new Marksheet("A4","Pinkesh K",89));
		marksheets.add(new Marksheet("A2","Sindhu P",85));
		marksheets.add(new Marksheet("A1","Janvi A",90));
		marksheets.add(new Marksheet("A1","anvi A",90));
		
//		 Sort elements by comparable
		Collections.sort(marksheets);
/*		for (Object object : marksheets) {
			System.out.println(object);*/
		
			Iterator it= marksheets.iterator();
			 while(it.hasNext()){
				Object o= it.next();
				System.out.println(o);
			 }
			
		
		}
	}


