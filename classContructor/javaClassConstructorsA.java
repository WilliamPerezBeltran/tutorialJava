public class javaClassConstructorsA{
	int modelAge;
	String modelName;
	public javaClassConstructorsA(int age, String name){
		modelAge = age; 
		modelName = name;
	}
	public static void main(String[] args){
		javaClassConstructorsA myObj =  new javaClassConstructorsA(12, "pepito");
		System.out.println("Name: "+myObj.modelName);
		System.out.println("Age: "+myObj.modelAge);
	}
}