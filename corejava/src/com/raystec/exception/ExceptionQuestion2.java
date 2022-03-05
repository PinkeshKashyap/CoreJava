package com.raystec.exception;

public class ExceptionQuestion2 {
	public static void main(String[] args) {
		try{String s= "HelloRays";
		System.out.println(s.charAt(15));
		}catch(StringIndexOutOfBoundsException r){
			System.out.println(r.getMessage());
			System.exit(0 );
		}finally {System.out.println("Hello I am Finally");}
		
	}

}
