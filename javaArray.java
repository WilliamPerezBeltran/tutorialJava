/*

reference: http://www.manualweb.net/java/arrays-java/
reference: https://www.w3schools.com/java/java_arrays.asp

Declaration:
String[] cars  || String cars[] 

sintax
tipo_dato nombre_array[];
nombre_array = new tipo_dato[tamanio];

==========================
For-Each Loop
for (type variableName : arrayName) {
  // code block to be executed
}

==========================
Declaring array

char arrayCharacter[];

char[] arrayCharacter;
arrayCharacter = new char[10];

char[] arrayCharacter = new char[10];


*/

public class javaArray {
	public static void main(String[] args){

		// declaring array with elements
		char[] arrayChar0 = {'a','s','d','f'};
		for (char t : arrayChar0) {
			System.out.println(t);
		}
		// declaring array without elements but specifing the size
		// first method
		char[] arrayChar1;
		arrayChar1 = new char[10];
		// second method
		char[] arrayChar2 = new char[10];
		// =======================================================

		String cars[] = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[0]);

		cars[0] = "change";

		System.out.println(cars[0]);
		System.out.println("array length: "+cars.length);

		System.out.println("---");
		for (int i=0 ;i<cars.length ;i++ ) {
			System.out.println(cars[i]);
		}

		System.out.println("---");
		for (String car : cars) {
			System.out.println(car);
		}

		// =======================================================
		// -----Multidimensional Arrays-----
		int[][] mynumbers = {{1,2,3,4},{5,6,7,8}};
		int x = mynumbers[0][0];

		System.out.println(x);
		for (int i=0 ;i<mynumbers.length ;i++) {
			for (int j=0 ;j<mynumbers[i].length ;j++) {
				System.out.println(mynumbers[i][j]);
			}	
		}

		System.out.println("----------------");
		char[] arrayCharacter = new char[10];
		for (int i=0 ;i<arrayCharacter.length ;i++) {
			// System.out.println(i);
			System.out.println((char)i);
			arrayCharacter[i] = (char)i; 
		}

		int num = 70;
		//type casting
		char ch = (char)num;  
		System.out.println(ch);  

		// for (int i=0 ;i<arrayCharacter.length ;i++) {
		// 	System.out.println(arrayCharacter[i]);
		// }

		// for(char c: arrayCharacter){
		// 	System.out.println(c);
		// }

	}
}