package com.raystech.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ToReadWritePrimitiveDataType {
	
	public static void main(String[] args) throws Exception {
		
		FileOutputStream file= new FileOutputStream("d:/primitivedata.dat");
		DataOutputStream out = new  DataOutputStream(file);
		
		out.writeInt(10);
		out.writeBoolean(true);
		out.writeChar('A');
		out.writeDouble(50.20);
		out.close();
		file.close();
		System.out.println("Primitive Data Successfully Written");
		main1(args);
	
	
	}

	public static void main1(String[] args) throws Exception {

		FileInputStream file= new FileInputStream("d:/primitivedata.dat");
		DataInputStream in = new  DataInputStream(file);
		
	
		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		System.out.println(in.readChar());
		System.out.println(in.readDouble());
		in.close();
		file.close();
		System.out.println("Primitive Data Successfully read");
		
		
	}
}
