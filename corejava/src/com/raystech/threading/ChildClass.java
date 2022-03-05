package com.raystech.threading;

public class ChildClass extends ParentClass implements Runnable {
	
	private String name;
	
	public ChildClass(){}
	public ChildClass(String name){
		this.name= name;
	}
	public void run() {
		for (int i=0; i<50; i++) {
	
		
			
			System.out.println(i + ": " + name);
	
		}
	}
}
