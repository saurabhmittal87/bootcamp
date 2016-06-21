package com.ttnd.bootcamp;

public class StringDemo {

	public static void main(String...args){
		String seperateString = "This is my dummy Strin";
		String dummyString = "This is my dummy String";
		String anotherDummyString = "This is my dummy String";
		
		System.out.println(seperateString.hashCode());
		System.out.println(dummyString.hashCode());
		System.out.println(anotherDummyString.hashCode());
		
		System.out.println("\n\ndummyString: " + dummyString);
		System.out.println("Length: " + dummyString.length());
		System.out.println("Character at index 2: " + dummyString.charAt(2));
		System.out.println("Index(first) of m: " + dummyString.indexOf('m'));
		System.out.println("Substring from index 2 to 4" + dummyString.substring(2,4));
		System.out.println("Concatenate \"values\": " + dummyString.concat(" values"));
		System.out.println("Comparision with seperateString: " + dummyString.compareTo(seperateString));
		System.out.println("Contains \"Hello\": " + dummyString.contains("Hello"));
		System.out.println("To Lower Case: " + dummyString.toLowerCase());
	}
}
