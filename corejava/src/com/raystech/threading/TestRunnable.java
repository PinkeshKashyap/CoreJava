package com.raystech.threading;

public class TestRunnable {
	public static void main(String[] args) {
	
	 ChildClass ch1 = new ChildClass("Hellon World");
	 ChildClass ch2 = new ChildClass("Hellon Rays");
	 
	 Thread th = new Thread(ch1);
	 Thread th1  =  new Thread(ch2);
	 th1.start();
	 th.start();
	 
	 
	
	}
}
