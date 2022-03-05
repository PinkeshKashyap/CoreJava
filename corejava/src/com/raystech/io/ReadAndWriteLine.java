package com.raystech.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.plaf.SliderUI;

public class ReadAndWriteLine {
	
//	 THIS IS METHOD USED TO WRITE DATA
	public static void main(String[] args) throws Exception {
		
		FileWriter f = new FileWriter("D:/ReadWriteLine.txt");
//		BufferedWriter b = new BufferedWriter(f);
//		we can also use print writer instead of buffered writer
		PrintWriter p = new PrintWriter(f);
		
		for(int i=0; i<5; i++){
//			b.write("line number: " + i + "\n" );
//			when we use print writer we have to use print or println method instead of write method.
			p.println("line number: " + i);
		}
		p.close();
		f.close();
		main1(args);
	}
	
	
//	 THIS METHOD IS USED TO READ DATA
	public static void main1(String[] args) throws Exception {
		 
		
		FileReader f = new FileReader("D:/ReadWriteLine.txt");
		BufferedReader b = new BufferedReader(f);
		
		String s = b.readLine();
		 while(s!= null){
		     
			 System.out.println(s);
			 s = b.readLine();
		 }
		 b.close();
		 f.close();
		
	}

}
