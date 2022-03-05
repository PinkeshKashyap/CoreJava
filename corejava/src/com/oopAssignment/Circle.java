package com.oopAssignment;

public class Circle extends Shape {
	private double radius;
	public static final double PI=3.14;
	public Circle(double r){
		radius=r;
	}
	public double getRadius() {
		return radius;
	}
	
	public static double getPi() {
		return PI;
	}
	public double area(){
		return radius*radius*PI;
	}

}
