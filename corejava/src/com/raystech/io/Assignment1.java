package com.raystech.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader("d:/Email.txt");

		Scanner sc = new Scanner(file);

		FileWriter writer = new FileWriter("d:/Copy.txt");

		PrintWriter pw = new PrintWriter(writer);

		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

		while (sc.hasNextLine()) {
			String str = sc.nextLine();

			if (str.matches(regex)) {
				System.out.println(str);
				pw.println(str);

			}
		}
		pw.close();
		writer.close();
		sc.close();
		file.close();

	}

}
