package com.raystec.oop;

public class TestShape {
	public static void main (String[] args){
		Shape sh= new Shape();
		sh.setBorderWidth(10);
		sh.setColor("yellow");
		
		String c=sh.getColor();
		int b=sh.getBorderWidth();
		System.out.println(c+" "+b );
		
		
		
	}

}
