package com.raystec.exception;

public class ExceptionHandling {
	public static void main(String[] args) {
		try {double div= 15/0;
		System.out.println(div);
		}
		catch(Exception e){
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally{
			System.out.println("it is finally");
		}
	}
}
