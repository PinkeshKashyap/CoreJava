package com.raystec.exception;

public class ExceptionAssignment {
	public static void main(String[] args) {
	     try{double div=15/2;
			System.out.println(div);
		try {String s=null;
			System.out.println(s.length());
			
		}catch(NullPointerException e){
			System.out.println("this is Null pointer exception");
		}finally{System.out.println("this is the finally of String exception");}
	     }
	     catch(ArithmeticException e){
	    	 System.out.println("this is arithmetic exception");
	     }finally{System.out.println("this is the finally of Arithmetic exception");}
	     
	}

}
