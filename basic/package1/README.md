## One it is already done the package 

> javac MyPackage.java
> javac -d . MyPackage.java


This forces the compiler to create the "mypack" package.

The **-d** keyword specifies the destination for where to save the class file. You can use any directory name, like c:/user (windows), or, if you want to keep the package within the same directory, you can use the dot sign **"."**, like in the example above.

**Note**: The package name should be written in lower case to avoid conflict with class names.

## Execute package
> java mypack.MyPackage
> java mypack.MyPackageA
> java mypack.MyPackageB
