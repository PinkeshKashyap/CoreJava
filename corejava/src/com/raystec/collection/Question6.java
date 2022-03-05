package com.raystec.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Question6 {
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> h=  new LinkedHashSet<Integer> ();

		h.add(52);
		h.add(2);
		h.add(null);
		h.add(78);
		h.add(54);
		h.add(4);
		h.add(5);
		h.add(201);
		h.add(545);
		h.add(454);
		
		
		Iterator it = h.iterator();
		 while(it.hasNext()){
			 Object o= it.next();
			 System.out.println(o);
		 }
//		 TreeSet t= new TreeSet();
//		 for(int i=0; i<10; i++){
//			 t.add(i);
//		 }
//		 System.out.println(t);
//		 
//		 LinkedHashSet l=  new LinkedHashSet();
//		 for(int i=0; i<10; i++){
//			 l.add(i);
//	}
//		 System.out.println(l);
//		 
		
	}

}
