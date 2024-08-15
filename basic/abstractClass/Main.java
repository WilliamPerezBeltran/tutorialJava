/*
abstract:
for classes:
	- he class cannot be used to create objects 
	(To access an abstract class, it must be inherited 
	from another class.

For attributes and methods:
	-Can only be used in an abstract class, and can only be used on methods. 
	The method does not have a body, for example abstract void run();. The body is 
	provided by the subclass (inherited from). You will learn more about inheritance
	 and abstraction in the Inheritance and Abstraction chapters
*/

// abstract class
abstract class Main {
  public String fname = "John";
  public int age = 24;
  public abstract void study(); // abstract method 
}
//
// Subclass (inherit from Main)
class Student extends Main {
  public int graduationYear = 2018;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Studying all day long");
  }
}
