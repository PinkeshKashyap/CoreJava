package com.raystech.io;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadChar {
	public static void main(String[] args) throws Exception {
		
		FileReader f = new FileReader("d:/Email.txt");

		char chr;
		
		int ch = f.read();
		while(ch!=-1){
			chr=(char)ch;
			System.out.println(chr);
			ch=f.read();
			
		}
	}

}
