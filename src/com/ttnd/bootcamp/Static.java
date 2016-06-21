package com.ttnd.bootcamp;

public class Static {

	public static void main(String...args){
		System.out.println("Another class variable's value (without object): " + AnotherDummyClass.variable);
	}
}

class AnotherDummyClass {
	public static String variable = "Hello";
}
