package com.oopAssignment;

public abstract class Shape {
private String color;
private int BroderWidth;
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getBroderWidth() {
	return BroderWidth;
}
public void setBroderWidth(int broderWidth) {
	BroderWidth = broderWidth;
}

public abstract double area();
}
