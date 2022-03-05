package com.raystec.exception;

public class ExceptionAssignment1 {
public static void main(String[] args) {
	try{ int i=20;
	int j=0;
	int div = i/j;
	System.out.println(div);
	}catch(ArithmeticException e){
		System.out.println("This is Arithmetic Exception");
		try{String n= "hello";
		System.out.println(n.charAt(5));
		}catch(StringIndexOutOfBoundsException r){
			System.out.println("this is the exception for string ");
		}finally{
			System.out.println("this is finally");
		}
	}finally{System.out.println("Tis is finally of first try block");}
}
}
