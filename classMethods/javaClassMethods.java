/*
Static vs. Non-Static
You will often see Java programs that have either <static> or <public> attributes and methods.

In the example above, we created a <static> method, which means that it can be accessed 
without creating an object of the class, unlike <public>, which can only be accessed by objects:
*/

public class javaClassMethods {
  
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod(){
  	System.out.println("Public methods must be called by creating objects");
  }
  public static void main(String[] args) {
    myStaticMethod();
    // myPublicMethod(); This would compile an error
    
    // It needed to create a object's instance
    javaClassMethods myObj = new javaClassMethods(); // Create an object of Main (In this case javaClassMethods)
    myObj.myPublicMethod(); // Call the public method on the object
  }
}

// Outputs "Hello World!"