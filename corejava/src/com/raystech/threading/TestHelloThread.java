package com.raystech.threading;

import javax.xml.stream.events.StartDocument;

public class TestHelloThread {
	public static void main(String[] args) {
		
		HelloThread h1 = new HelloThread("PINKESH");
		HelloThread h2 = new HelloThread("AASHISH");
		
		h1.start();
		h2.start();
	}

}
