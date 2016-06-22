package com.ttnd.bootcamp;

public class OverloadingExample {
	
	public void method(int a){
		System.out.println("Method with integer parameter called");
	}
	
	public void method(double a){
		System.out.println("Method with double parameter called");
	}

	public static void main(String...args) {
		OverloadingExample object = new OverloadingExample();
		
		object.method(10);
		object.method(10.0);
	}
}
