/*
explication: 
https://www.youtube.com/watch?v=WRE3BbXPZNY&t=216s&ab_channel=FernandoHerrera
*/


// Code from filename: Main.java
// abstract class
abstract class Animal {
  public String fname = "John";
  public int patas;
  public abstract void emitirSonido(); // abstract method
}

// Subclass (inherit from Main)
class Perro extends Animal {
  public int cola ;
  public void emitirSonido() { // the body of the abstract method is provided here
    System.out.println("Wowww");
  }
}
// End code from filename: Main.java

// Code from filename: Second.java
class abstractClass {
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Main)
    Perro myObj = new Perro();

    myObj.cola = 1;
    myObj.patas = 4;
    System.out.println("fname: " + myObj.fname);
    System.out.println("cola: " + myObj.cola);
    System.out.println("patas: " + myObj.patas);
    myObj.emitirSonido();
  }
}