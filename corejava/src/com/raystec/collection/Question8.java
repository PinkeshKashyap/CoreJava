package com.raystec.collection;
import java.util.*;
public class Question8 {
	public static void main(String[] args) {
		
		Stack s = new Stack<>();
		Stack s1= new Stack<>();
	
		for(char i= 'a'; i<= 'z'; i++ ){
			s.push(i);
			
			s1.push(s.pop());
			
			System.out.println(s1.pop());
			
			}
	}
}

		
	/*	System.out.println("Stack: "+ s);
		
		
		
		Stack s1= new Stack<>();
		
		for (char i = 'z'; i >= 'a'; i--) {
			
			s1.push(s.pop());
		}
		System.out.println("Stack : "+ s);
		System.out.println(s1);
		
		
		for (char i = 'z'; i >= 'a'; i--){
			System.out.println(s1.pop());
		}  
		}	  	
	} */
