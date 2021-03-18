public class javaMethodsParameter{
	public static void main(String[] args){
		myMethod("ramiro");
		myMethod1("rambo", 25);
		System.out.println(myMethod2("willlll"));
		checkAge(56);

	}

	static void myMethod(String name){
		System.out.println("My name is: "+name);
	}

	static void myMethod1(String name, int age){
		System.out.println("Method: myMethod1 => My name is: "+name+", age: "+ age);
	}

	static String myMethod2(String name){
		return name;
	}

	static void  checkAge(int age){
		if (age < 18) {
			System.out.println("Menor a 18");
			
		}else{
			System.out.println("Mayor a 18");

		}
		System.out.println("edad = "+age);
	}
}