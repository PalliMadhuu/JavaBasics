package com.learnings;

public class DataTypes extends AbstractClass{
	
	public void nonStaticMethod() {
		System.out.println("This is a non static method");
	}

	public static void main(String[] args) {
        
		
		//A type wich is used to store some data is known as Data type
		//Premitive data types
		byte packageId=42; // byte is a data type and packageId is an identifier
		short numberOfPackages=4633;
		int numberOfProducts=87493345;
		long totalProductsPrice=89373939393l;
		float priceOfEachProduct=839303.64f;
		double weightOfTotalProuctsInKg=8308943.353;
		char firstLetterOfProduct='W';
		boolean isProductsChecked=true;
		
		//Non Premitive Data types(Strings, Classes,Arrays)
		
		String nameOfProducts=new String("Water Bottles");
		String descriptionOfProducts="These are Plastice Water Bottles";
		int [] productIds= {43,53,56,75,35,74,89,853}; //Array is Fixed in Size and homogenious
		 
		DataTypes dataTypes=new DataTypes();
		dataTypes.nonStaticMethod();

		System.out.println("Package Id :"+packageId);
		System.out.println("Number Of Packages :"+numberOfPackages);
		System.out.println("Number Of Products :"+ numberOfProducts);
		System.out.println("Total Products Price :"+totalProductsPrice);
		System.out.println("Price Of Each Product :" +priceOfEachProduct);
		System.out.println("Weight Of total Products in Kilo Grams :"+ weightOfTotalProuctsInKg);
		System.out.println("First Letter Of Product :"+firstLetterOfProduct);
		System.out.println("Is Products Checked :"+isProductsChecked);
		System.out.println("Name of the Product :"+nameOfProducts);
		System.out.println("Description Of Method :"+descriptionOfProducts);
		
		System.out.println("List of some product Id's");
		
		for(int productId :  productIds) {
			System.out.println( "Product Id :"+ productId);
		}
		//we can call directly static method if it is in same class
		callingMethodsInAnotherClass();
		
		
		

	}
	
	public static void callingMethodsInAnotherClass() {
		
		//To call non static methods we have to create an object
		
		Methods methods=new Methods();
		methods.nonStaticMethod();
		methods.nonStaticMethod(343, "Hello world");
		//Static Methods can be called by method name if method is in another class
		Methods.staticMethod();
	
	}
	
	public void abstractMethod() {
		System.out.println("This is an Abstract Method");
	}

}
