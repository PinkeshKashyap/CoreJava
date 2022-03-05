package com.raystec.exception;

public class HelloVijay {
	public static void main(String[] args) {
		auth("vijay");
		
	} public static void auth(String name){
		 if (!"admin".equals(name)){
			 LoginException e= new LoginException();
			 try {
				throw e;
			} catch (LoginException e1) {
				System.out.println(e.getMessage());
			}
		 }
	}

}
