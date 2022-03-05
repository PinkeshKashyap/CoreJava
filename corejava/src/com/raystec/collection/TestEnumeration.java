package com.raystec.collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {
	public static void main(String[] args) {
		
		Vector v= new Vector<>();
		v.add(22);
		v.add(45);
		v.add(48);
		
		
		Enumeration e= v.elements();
		v.add(2+6);
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}    
		
	}

}
