package com.raystech.threading;

import java.io.BufferedReader;
import java.io.FileReader;

public class QuestionPaper extends Thread {

	public void run() {
		try {
			FileReader f = new FileReader("d:/Paper.txt");
			BufferedReader b = new BufferedReader(f);

			String s = b.readLine();
			while (s != null) {
				System.out.println(s);
				System.out.println(" ");
				sleep(5000);
				s = b.readLine();
				
			}
			b.close();
			f.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}+
