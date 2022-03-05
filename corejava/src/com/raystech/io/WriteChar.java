package com.raystech.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteChar {
	public static void main(String[] args) throws Exception {
		
		FileWriter f = new FileWriter("d:/hpp.txt");
		
		f.write('a');
		f.write('b');
		f.write('c');
	f.close();
	}

}
