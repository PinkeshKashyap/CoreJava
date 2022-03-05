package com.raystech.io;

import java.io.File;
import java.util.Date;

public abstract class TestFileIO {
	
	public static void main(String[] args) {
		
		File f= new File("D:/AutoCAD 2021");
		
		if(f.exists()){
			System.out.println("Name: "+ f.getName());
			System.out.println("Absolute patyh: " + f.getAbsolutePath());
			System.out.println("total space: "+f.getTotalSpace());
			System.out.println("can execute: "+f.canExecute());
			System.out.println("f is file: "+f.isFile());
			System.out.println("f is directory: "+ f.isDirectory());
			System.out.println("can write: "+f.canWrite());
			System.out.println("can read: "+ f.canRead());
			System.out.println("date modified: "+ new Date(f.lastModified()));
			
			} 
		
		
	}

}
