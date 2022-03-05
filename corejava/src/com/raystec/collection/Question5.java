package com.raystec.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Question5 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a= new ArrayList<Integer>();
		long n= 100000;
		
		for(int i=0 ; i<=n; i++){
			a.add(i);
		} 	
		
		HashSet<Integer> h= new HashSet<Integer>(a);
		 
		 
		 Random r= new Random();
		 for(int i=0; i<50; i++){
			 
			 int num= r.nextInt(100000);
			 System.out.println(num);
			
		 }
		}
			
	} 


