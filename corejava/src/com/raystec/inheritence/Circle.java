package com.raystec.inheritence;

public class Circle extends Shape {
 private int radius;
 public static final double PI=3.14;

 public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}

public static double getPi() {
	return PI;
}

public double area(){
	 double a=radius*radius*PI;
	 return a;  
 }
 

 

}
