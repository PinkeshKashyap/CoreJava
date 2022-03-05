package com.raystec.inheritence;

public class TestShape {
	public static void main(String[] args) {
		
	    Circle c=new Circle();
		c.setColor("Red");
		c.setBorderWidth(10);
		c.setRadius(5);
		System.out.println("Border Width of Circle: "+c.getBorderWidth());
		System.out.println("Color of Circle: "+c.getColor());
		System.out.println("Radius of Circle: "+c.getRadius());
		System.out.println("Area of Cirle: "+ c.area());
		System.out.println("");
		
		
		
		Rectangle r=new Rectangle();
		r.setBorderWidth(7);
		r.setColor("Yellow");
		r.setLength(10);
		r.setWidth(20);
		System.out.println("Border Width of Rectangle: "+r.getBorderWidth());
		System.out.println("Color of Rectangle: "+r.getColor());
	    System.out.println("Length of Rectangle: "+r.getLength());
	    System.out.println("Width of Rectangle: "+r.getWidth());
		System.out.println("Area of Rectangle: "+r.area());
		System.out.println("");
		
		
		
		Triangle t=new Triangle(5,2);
		t.setBorderWidth(5);
		t.setColor("green");
		System.out.println("Border Width of Triangle: "+t.getBorderWidth());
		System.out.println("Color of Triangle: "+t.getColor());
	    System.out.println("Base of Triangle: "+t.getarea());
	    System.out.println("Height of Triangle: "+t.getbase());
	    System.out.println("Area of Triangle"+t.getheight());
	    
		
		
	}

}
