interface FirstInterface{
	public void myMethod();
}
interface SecondInterface{
	public void myOtherMethod();
}

class DemoClass implements FirstInterface, SecondInterface{
	public void myMethod(){
		System.out.println("call FirstInterface myMethod");

	}

	public void myOtherMethod(){
		System.out.println("call SecondInterface myOtherMethod");
	}
}

class MultipleInterfaces{
	public static void main(String[] args){
		DemoClass myObj = new DemoClass();
		myObj.myMethod();
		myObj.myOtherMethod();

	}
}