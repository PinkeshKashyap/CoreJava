package com.raystech.threading;

public class HelloThread extends Thread {

	private String name;

	public HelloThread() {
	}

	public HelloThread(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + ": " + name);

		}
	}

}
