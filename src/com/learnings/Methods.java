package com.learnings;

 public class Methods {
	
	
	//Methods are classified into two types Static and Non Static
	
	
	//Static Method
	public static void staticMethod() {
		System.out.println("This is a Static Method");
	}
	
	//Non Static Method
	public void nonStaticMethod() {
		System.out.println("This is a Non Static Method without args");
	}
	public void nonStaticMethod(int number,String name) {
		System.out.println("This is a Non Static Method with Args");
	}
	
	//Abstract Method: Method which has only method signature but does not have method Implementation.
	//If we declare a method as abstract then the class is also abstract
	


}
