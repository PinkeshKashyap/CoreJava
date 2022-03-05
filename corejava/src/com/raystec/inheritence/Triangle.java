package com.raystec.inheritence;

public class Triangle extends Shape {
	private int base;
	private int height;
    
	public Triangle(){}
	public Triangle(int b, int h){
		base=b;
		height=h;
	}
	public int getbase(){
		return base;
	}
	public int getheight(){
		return height;
	}
	public double getarea(){
		double a=0.5*base*height;
		return a;
	}

}
