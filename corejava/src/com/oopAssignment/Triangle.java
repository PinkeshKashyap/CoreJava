package com.oopAssignment;

public class Triangle extends Shape {
	private int base;
	private int height;
	public Triangle(int b,int h){
		base=b;
		height=h;
	}
	public int getBase() {
		return base;
	}
	public int getHeight() {
		return height;
	}
	public double area(){
		return 0.5*base*height;
		
	}

}
