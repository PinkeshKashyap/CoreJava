package com.raystec.exception;

public class ExceptionAssignment2 {
public static void main(String[] args) {
try{String s= "HelloRays";
System.out.println(s.charAt(15));
}catch(StringIndexOutOfBoundsException r){
	System.out.println("this is exception of String");
}finally{System.out.println("this is the finally of String Block");
try{double div=60/0;
System.out.println(div);
}catch(ArithmeticException r){
	System.out.println("this is the Arithmetic Exception");
}
}
}
}
