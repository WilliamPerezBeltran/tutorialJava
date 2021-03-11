/*
class Animal {
    public Animal() {
        System.out.println("constructor padre ");
    }
}

class Cat extends Animal {
    public Cat() {
        super();
        System.out.println("Construyendo un gato.");
    }
}

public class ExampleSuperA {
    public static void main(String[] a) {
        new Cat();
    }
}
*/

class Animal {
    public Animal(String arg) {
        System.out.println("Construyendo un animal: " + arg);
    }
}

class Cat extends Animal {
    public Cat() {
        super("This is from cat constructor");
        System.out.println("Construyendo un gato.");
    }
}

public class ExampleASuper {
    public static void main(String[] args) {
        new Cat();
    }
}