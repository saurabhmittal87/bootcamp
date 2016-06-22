package com.ttnd.bootcamp;

class SuperClass {
	public void method(){
		System.out.println("Super class method called");
	}
}

public class OverridingExample extends SuperClass {
	
	public void method(){
		System.out.println("Sub class method called");
	}
	
	public static void main(String...args){
		new OverridingExample().method();
	}
}
