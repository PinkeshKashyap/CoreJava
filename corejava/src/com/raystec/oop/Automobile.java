package com.raystec.oop;

public class Automobile {
	private String color;
	private int speed;
	private  String make;
	public static final int NO_OF_GEARS=5;

	public Automobile(){}
public Automobile(String c,String m,int s){
	color=c;
	make=m;
	speed=s;
}
public String getcolor(){
	return color;
}
public String getmake(){
	return make;
}
public int getspeed(){
	return speed;
}
public static int getNO_OF_GEARS() {
	return NO_OF_GEARS;
}
public void brake(){
	
	}
}