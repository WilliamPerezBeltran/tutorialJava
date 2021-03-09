public class javaClassAttributes{
	final int z = 670;
	int a = 67;
	int x;
	int y;
	int age=34;
	String name;
	public static void main(String[] args){
		javaClassAttributes myObj =  new javaClassAttributes(); 
		javaClassAttributes myObj1 =  new javaClassAttributes(); 
		myObj.x = 45;
		myObj.y = 100;
		System.out.println(myObj.a);
		System.out.println(myObj.x);
		System.out.println(myObj.y);
		System.out.println(myObj.z);
		myObj1.a =125485; 
		myObj1.name ="pepito"; 
		System.out.println(myObj1.a);
		System.out.println("myObj1 Name: "+ myObj1.name);
		System.out.println("myObj1 Age: "+ myObj1.age);
	}
}