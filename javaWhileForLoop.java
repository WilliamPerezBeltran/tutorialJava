/*
Java While Loop
The while loop loops through a block of code as long as a specified condition is true:

Syntax
while (condition) {
  // code block to be executed
}
===============================
do {
  // code block to be executed
}
while (condition);
===============================
Java For Loop
When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:

Syntax
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}

*/
public class javaWhileForLoop {
	public static void main(String[] args){
		int i = 0;
		while (i < 5) {
		  System.out.println(i);
		  i++;
		}
		System.out.println("==");
		// ====================================
		

		int a = 0;
		do {
		  System.out.println(a);
		  a++;
		}while (a < 5);
		System.out.println("==");
		// ====================================



		for (int j = 0; j < 5; j++) {
		  System.out.println(j);
		}
		System.out.println("==");
		// ====================================


		for (int k = 0; k < 10; k++) {
		  if (k == 4) {
		    break;
		  }
		  System.out.println(k);
		}
		System.out.println("==");
		// ====================================


		for (int l = 0; l < 10; l++) {
		  if (l == 4) {
		    continue;
		  }
		  System.out.println(l);
		}
		System.out.println("==");
	}
}
