package com.abstrct;

public class Rectangle extends Shape  {
private int length;
private int width;
public Rectangle(){}
public Rectangle(int l,int w){
	length =l;
	width =w;
}
public int getlength(){
	return length;
}
public int getWidth(){
	return width;
}
public void area(){
	System.out.println(length*width);
}
}

