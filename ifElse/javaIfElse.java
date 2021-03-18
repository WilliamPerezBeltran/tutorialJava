/*
Java Conditions and If Statements
Java supports the usual logical conditions from mathematics:

Less than: 					a < b
Less than or equal to: 		a <= b
Greater than: 				a > b
Greater than or equal to: 	a >= b
Equal to 					a == b
Not Equal to: 				a != b

You can use these conditions to perform different actions for different decisions.

Java has the following conditional statements:

Use <if> 		to specify a block of code to be executed, if a specified condition is true
Use <else> 		to specify a block of code to be executed, if the same condition is false
Use <else if>  	to specify a new condition to test, if the first condition is false
Use <switch> 	to specify many alternative blocks of code to be executed

Syntax
if (condition) {
  // block of code to be executed if the condition is true
} else {
  // block of code to be executed if the condition is false
}

================================

The else if Statement
Use the else if statement to specify a new condition if the first condition is false.

Syntax
if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}
================================
Short Hand If...Else (Ternary Operator)
Syntax
variable = (condition) ? expressionTrue :  expressionFalse;

*/
public class javaIfElse {
	public static void main(String[] args){
		int time = 20;
		if (time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		// Outputs "Good evening."
		// ==========================

		int time1 = 22;
		if (time1 < 10) {
		  System.out.println("Good morning.");
		} else if (time1 < 20) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		// Outputs "Good evening."
		// ==========================

		int time2 = 20;
		String result = (time2 < 18) ? "Good day." : "Good evening.";
		System.out.println(result);
	}
}
