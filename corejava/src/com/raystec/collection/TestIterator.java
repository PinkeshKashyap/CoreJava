package com.raystec.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
	public static void main(String[] args) {
		 ArrayList l= new ArrayList<>();
		 
		 l.add("Pinkesh");
		
		 l.add("Kashyap");
		 l.add("Hello");
		 l.add("Rays");
		 
		System.out.println(l);
		for (Object object : l) {
			System.out.println(object);
			
		}
//		  Iterator i= l.iterator();
//		 
//	
//		 while(i.hasNext()){
//			 Object o1=i.next();
//			 System.out.println(o1);
//		 }
//		 System.out.println(i.hasNext());
//		
		 
	}

}
