package com.learnings;

public class TypeCasting {

	public static void main(String[] args) {
		//we have two types of typecasting(narrowing and widening)
		//Narrowing : Converting the larger data type to smaller data type is known as Narrowing , we have to do explicitly
		//Widening : Converting the smaller data type to larger data type is known as Widening, compiler will automatically convert (implicit conversion)
		int smallNumber=10;
		short conversionOfSmallNum=(short)smallNumber; //Narrowing (explicit conversion)
		long longNumber=conversionOfSmallNum ; //Widening (Implicit Conversion)
		
		char character='H';
		String convertedString=Character.toString(character); 
		
		//we can only convert boolean data type to boolean 
//		boolean isConversionPrgrm=convertedString;
		 
		Animal animal=new Lion("Lion","Roars");
//		Upcasting : Converting SubClass Object to Super Class Object is known as Upcasting
		animal.makeSound(); 
//		DownCasting : Converting SuperClass Object to subClass Object is known as DownCasting
//		Direct DownCasting is not possible without upcasting
		Lion lion=(Lion) animal;
		lion.makeSound();
		
		System.out.println(smallNumber);
		System.out.println(conversionOfSmallNum);
		System.out.println(longNumber);
		System.out.println(character);
		System.out.println(convertedString);
		
		
		
	}

}
