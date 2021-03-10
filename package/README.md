## Java Packages & API
A package in Java is used to group related classes. Think of it as **a folder in a file directory**. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:

- Built-in Packages (packages from the Java API)
- User-defined Packages (create your own packages)


To use a class or a package from the library, you need to use the import keyword:

## Syntax
> import package.name.Class;   // Import a single class
> import package.name.*;   // Import the whole package


## Example
> import java.util.Scanner;

```
Example
Using the Scanner class to get user input:

import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = myObj.nextLine();
    System.out.println("Username is: " + userName);
  }
}
```
## import whole package

Example
> import java.util.*;

## User-defined Packages

```
MyPackageClass.java
package mypack;
class MyPackageClass {
  public static void main(String[] args) {
    System.out.println("This is my package!");
  }
}
```
 Save the file as **MyPackageClass.java**, and compile it:

run: 
> C:\Users\Your Name>javac MyPackageClass.java

### Then compile the package:

> C:\Users\Your Name>javac -d . MyPackageClass.java

This forces the compiler to create the "mypack" package.

> The **-d** keyword specifies the destination for where to save the class file. You can use any directory name, like c:/user (windows), or, if you want to keep the package within the same directory, you can use the dot sign ".", like in the example above.

**Note**: The package name should be written in lower case to avoid conflict with class names.


When we compiled the package in the example above, a new folder was created, called "mypack".

To run the **MyPackageClass.java** file, write the following:

> C:\Users\Your Name>java mypack.MyPackageClass