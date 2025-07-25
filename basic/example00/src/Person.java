public class Person {
	private String name;
	private int age;

	//constructor de la clase
	public Person(String name, int age){
		this.name = name;
		this.age = age; 
	}

	public String getName(){
		return name;	
	}

	public void setName(){
		this.name = name;
	}

	public int getAge(){
		return age;	
	}

	public void setAge(){
		this.age = age; 
	}

	public void displayInfo(){
		System.out.println("name " + name);	
		System.out.println("age " + age);	
	}
}
