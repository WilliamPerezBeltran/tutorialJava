/*

reference : 
https://www.w3schools.com/java/java_data_types.asp

Data Type	Size		Description
byte		1 byte		Stores whole numbers from -128 to 127
short		2 bytes		Stores whole numbers from -32,768 to 32,767
int			4 bytes		Stores whole numbers from -2,147,483,648 to 2,147,483,647
long		8 bytes		Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float		4 bytes		Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double		8 bytes		Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean		1 bit		Stores true or false values
char		2 bytes		Stores a single character/letter or ASCII values


Non-Primitive Data Types
Non-primitive data types are called reference types because they refer to objects.

The main difference between primitive and non-primitive data types are:

Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
A primitive type has always a value, while non-primitive types can be null.
A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
The size of a primitive type depends on the data type, while non-primitive types have all the same size.
Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc. You will learn more about these in a later chapter.
*/

public class javaDataTypes {
	public static void main(String[] args){
		
		byte myNum = 100;
		System.out.println(myNum);

		short myNumShort= 5000;
		System.out.println(myNumShort);

		float myNum1 = 5.75f;
		System.out.println(myNum1);

		double myNum2 = 19.99d;
		System.out.println(myNum2);

		float f1 = 35e3f;
		double d1 = 12E4d;
		System.out.println(f1);
		System.out.println(d1);

		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);     // Outputs true
		System.out.println(isFishTasty);   // Outputs false

		char myGrade = 'B';
		System.out.println(myGrade);

		char a = 65, b = 66, c = 67;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		String greeting = "Hello World";
		System.out.println(greeting);

	}
}