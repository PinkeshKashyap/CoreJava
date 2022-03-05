package com.methodoverride;

public class Circle extends Shape{
	private  double radius;
	public static final double PI=3.14;
	public Circle() {
	}
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
		double a=PI*radius*radius;
		return a;
	}
	

}
