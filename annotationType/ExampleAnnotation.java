import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


// se inspecciona con esta libreria retention
@Retention(RetentionPolicy.RUNTIME)
@interface Myannotation{
	String value default "";
	String name;
	int age();
	String[] newNames;
}

@Myannotation(name="pepito",value="123",age=37,newNames={"Jenkov", "Peterson"});
public class MyClass {


}


public class ExampleAnnotation {
    public static void main(String[] args) {
        new MyClass()
    }
}


