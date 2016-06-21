package com.ttnd.bootcamp;

public class ThisKeyword {

	public int variable;
	public String name;
	
	public ThisKeyword(){
		System.out.println("Constructor called");
	}
	
	public void demostrateThis(int newVariableValue){
		this.variable = newVariableValue;
		System.out.println("Method called for: " + getName(this));
		System.out.println("Variable value: " + this.variable + "\n\n");
	}
	
	public String getName(ThisKeyword object){
		return object.name;
	}
	public static void main(String...args) {
		ThisKeyword object1 = new ThisKeyword();
		object1.name = "First";
		object1.demostrateThis(10);
		
		ThisKeyword object2 = new ThisKeyword();
		object2.name = "Second";
		object2.demostrateThis(15);
	}
}
