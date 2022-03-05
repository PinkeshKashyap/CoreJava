package com.methodoverride;

public class Rectangle extends Shape{
	private int length;
	private int width;
	public Rectangle(){
		
	}
	public Rectangle(int l,int b){
		length=l;
		width=b;
	}
	public int getlength(){
		return length;
	}
	public int getwidth(){
		return width;
	}
public double area(){
	return length*width;
}
}
