/*
Java String Methods:
All String Methods=> reference:   https://www.w3schools.com/java/java_ref_string.asp

Java Strings
Strings are used for storing text.
A String variable contains a collection of characters surrounded by double quotes:
*/

public class javaStrings {
	public static void main(String[] args){

		String txt = "ASDFFDDHEDDFDf";
		System.out.println("the length of the string: "+ txt.length());

		txt = "Hello World";
		System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt.toLowerCase());   // Outputs "hello world"

		txt = "Hello World";
		System.out.println(txt.indexOf("World"));   // Outputs "hello world"
		System.out.println(txt.indexOf("noExist"));   // Outputs "hello world"

		String firstName = "John";
		String lastName = "Doe";
		System.out.println(firstName + " " + lastName);
		System.out.println(firstName.concat(lastName));

		/*
		The solution to avoid this problem, is to use the backslash escape character.

		The backslash (\) escape character turns special characters into string characters:

		Escape character	Result	  Description
		\'					  '			Single quote
		\"					  "			Double quote
		\\					  \			Backslash

		*/

		// txt = "We are the so-called "Vikings" from the north.";
		txt = "We are the so-called \"Vikings\" from the north.";
		System.out.println(txt);

		String txt1 = "It\'s alright.";
		System.out.println(txt1);

		String txt2 = "The character \\ is called backslash.";
		System.out.println(txt2);

		// Adding Numbers and Strings
		int x = 3;
		int y = 9;
		int z = x + y;
		System.out.println(z);

		// If you add two strings, the result will be a string concatenation:
		String xString = "10";
		String yString = "20";
		String zString = xString + yString;   // z will be 1020 (a String)
		System.out.println(zString);

		// If you add a number and a string, the result will be a string concatenation:
		String xStr = "10";
		int yIn = 20;
		String stringConcatenation = xStr + yIn;   // z will be 1020 (a String)
		System.out.println(stringConcatenation);
	}
}