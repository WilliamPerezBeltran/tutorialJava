interface Animal{
	public void animalSound();
	public void sleep();
}

class Pig implements Animal{
	public void animalSound(){
		System.out.println("the pig say: wee wee");
	}

	public void sleep(){
		System.out.println("Zzzz");
	}
}
class Interface{
	public static void main(String[] args){
		Pig myInterfacePig = new Pig();
		myInterfacePig.animalSound();
		myInterfacePig.sleep();
 

	}
}