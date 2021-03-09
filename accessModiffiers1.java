public class accessModiffiers1{
	final int x = 10;
	final double PI = 3.1416;

	public static void main(String[] args){
		accessModiffiers1 myObj = new accessModiffiers1();
		myObj.x = 50; //will generate an error : cannot assign value to a final varialbe
		myObj.PI = 50; //will generate an error : cannot assign value to a final varialbe
		System.out.println(myObj.x);
		System.out.println(myObj.PI);
	}
}
