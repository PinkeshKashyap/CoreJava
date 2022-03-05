package com.raystec.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestCollection1 {
	public static void main(String[] args) {
		
		Set s= new HashSet();
		s.add(1);
		s.add("Hello");
		s.add(25);
		s.add(1);
		System.out.println(s);
//		for (Object o : s) {
//			System.out.println(o);
//		}
		
		Set t= new TreeSet();
		t.add("1");
		t.add("600");
		t.add("hello");
		System.out.println(t);
		
		
		SortedSet a= new TreeSet();
		a.add("hello");
		a.add("java");
		a.add("rays");
		a.add("1");
		System.out.println(a);
		
		for (Object object : a) {
			System.out.println(object);
		}
	}

}
