class Base{
	int a = 100;
	void show(){
		System.out.print("father's variable: ");
		System.out.println(a);
	}
}

class Son extends Base{
	int a = 200;
	void show(){
		super.show();
		System.out.print("son's variable: ");
		System.out.println(a);
	}
}


public class ExampleBSuper {
    public static void main(String[] args) {
        new Son().show();
    }
}


