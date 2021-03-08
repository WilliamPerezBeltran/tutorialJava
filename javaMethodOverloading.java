/*
reference: https://www.w3schools.com/java/java_methods_overloading.asp
Method Overloading
With method overloading, multiple methods can have the same name with different parameters:

Example
int myMethod(int x)
float myMethod(float x)
double myMethod(double x, double y)
*/
public class javaMethodOverloading {
	static int plusMethod(int x, int y){
		return x + y;
	}

	static double plusMethod(double x, double y){
		return x + y;
	}

	public static void main(String[] args) {
		int myNumInt = plusMethod(45, 10);
		double myNumdouble = plusMethod(45.25, 10.154);

		System.out.println("int: " + myNumInt);
		System.out.println("double: " + myNumdouble);
	}
}
