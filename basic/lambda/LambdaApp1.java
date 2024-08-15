import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class LambdaApp1{
	public void ordenar(){
		List<String> lista = new ArrayList<>();	
		lista.add("william");
		lista.add("rocio");
		lista.add("sandra");
		lista.add("cesar");

		/*
		sintax lambda of jdk < 1.7
		Collections.sort(lista, new Comparator<String>(){
			@Override
			public int compare(String obj1,String obj2){
				return obj1.compareTo(obj2);
			}
		});
		*/
		
		Collections.sort(lista, (String obj1,String obj2)->obj1.compareTo(obj2));

		for (String element:lista){
			System.out.println(element);
		}
	}

	public static void main(String[] args){

		LambdaApp1 app = new LambdaApp1();
		 app.ordenar();
		
	}
}
