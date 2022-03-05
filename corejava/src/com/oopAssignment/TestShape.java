package com.oopAssignment;

public class TestShape {
	public static void main(String[] args) {
//		Shape s=new Circle(5);
//		s.setBroderWidth(10);
//		s.setColor("Red");
//		s.area();
		
		Shape[] s = new Shape[3];
		s[0] = new Circle(5);
		s[1] = new Rectangle(5,2);
		s[2] = new Triangle(5,10);
		
		double totalArea = calcArea(s);
		System.out.println(totalArea);
	}
	public static double calcArea(Shape[] s){
		double totalArea = 0.0;
		for(int i=0; i<s.length; i++){
			totalArea = totalArea+s[i].area();
			
		}
		
		return totalArea ;
	}

}
