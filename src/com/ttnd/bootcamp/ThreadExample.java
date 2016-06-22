package com.ttnd.bootcamp;

public class ThreadExample {
	public static void main(String [] args) {
		MyThread out1 = new MyThread("Hello");
		MyThread out2 = new MyThread("There");
		Thread thr1 = new Thread(out1);
		Thread thr2 = new Thread(out2);
		thr1.start();
		thr2.start();
	}
}

class MyThread implements Runnable {
	private String toSay;

	public MyThread(String st) {
		toSay = st;
	}

	public void run() {
		try {
			for (;;) {
				System.out.println(toSay);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}