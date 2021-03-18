 class Person{
	// public String name;
	private String name;

	 // Getter
	public String getName(){
		return name;
	} 

	// Setter
	public void setName(String name){
		this.name = name;
	} 
}

public class javaEncapsulation{
	public static void main(String[] args){
		Person myObj = new Person();
		/*
		myObj.name = "Wilfredo Vargas"; //error: name has private access in Person
		System.out.println(myObj.name); //error: name has private access in Person
		*/

		/*
		Instead, we use the getName() 
		and setName() methods to 
		acccess and update the variable:
		*/


		myObj.setName("Wilfredo Vargas");
		System.out.println(myObj.getName()); //error: name has private access in Person
	}
}