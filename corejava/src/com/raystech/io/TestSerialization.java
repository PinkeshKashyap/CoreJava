package com.raystech.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerialization {
	public static void main(String[] args) throws Exception {
		main1(args);

		FileOutputStream file = new FileOutputStream("d:/object.ser");
		ObjectOutputStream out = new ObjectOutputStream(file);

		Employee emp = new Employee(10, "Hello", "Java", "abcd");

		out.writeObject(emp);
		out.close();

		System.out.println("Object is successfully persisted");

	}

	public static void main1(String[] args) throws Exception, IOException {

		FileInputStream file1 = new FileInputStream("d:/object.ser");
		ObjectInputStream in = new ObjectInputStream(file1);

		Employee emp = (Employee) in.readObject();

		System.out.println("ID: " + emp.getId());
		System.out.println("fname: " + emp.getFname());
		System.out.println("fname: " + emp.getLname());
		System.out.println("pwd: " + emp.getPwd());
		System.out.println("object readed successfully");
		in.close();

	}
}
