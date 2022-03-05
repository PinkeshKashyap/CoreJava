package com.raystec.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestCollection {
	public static void main(String[] args) {
		
		List<Object> l = new ArrayList<>();
		
		l.add(56);
		l.add(2.65);
		l.add('h');
		l.add("HELLO");
		l.add("Sunrays");
		
//		System.out.println(l.containsAll(l));
//		System.out.println(l.contains(56));
//		System.out.println(l.isEmpty());
//		System.out.println(l.remove(1));
//		l.retainAll(l);
//		System.out.println(l);
		
		
		
		ArrayList<Object> a= new ArrayList<Object>();
		
		a.add(56);
		a.add('r');
		a.add("RAYS");
		a.add("Sunrays");
		a.add('e');
		
//		System.out.println(a.size());
		
//		System.out.println(a.retainAll(l));
//		System.out.println(a);
//		
	/*	LinkedList<Object> s=new LinkedList<Object>();
		s.addAll(a);
		s.add(622);
		s.add("rays");
		s.add('w');
		System.out.println(s);*/
		
		Vector v= new Vector();
		v.add(56);
		v.add(25.04);
		v.add("Sunrays");
		v.add("pinkesh");
		v.add('r');
		
		System.out.println(a.retainAll(v));
		System.out.println(a);
		
		
		}
}
