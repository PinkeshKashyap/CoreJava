package com.raystech.ComparableComparator;

public class Marksheet implements Comparable<Marksheet>  {
	public String rollNo;
	public 	String name;
	public int physics;
	
	public Marksheet(){}
	
	public Marksheet(String r,String n,int p){
		rollNo= r;
		name=n;
		physics= p;
	
	}
	public String getrollNo(){
		return rollNo;
	}
	public String getname(){
		return name;
	}
	public int getphysics(){
		return physics;
	}
	
	public int compareTo (Marksheet m){
		return rollNo.compareTo(m.rollNo);
		
	}

	public String toString() {
		return rollNo+ ","+name+","+physics;
		
	}
	
	
}
