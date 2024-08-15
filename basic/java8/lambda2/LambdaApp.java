package proyectoJava1.tema2.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaApp {
	public void ordenar() {
		List<String> lista = new ArrayList<>();
		
		lista.add("mitoCode".toLowerCase());
		lista.add("Code".toLowerCase());
		lista.add("mito".toLowerCase());
		lista.add("aaamitoCode".toLowerCase());
		
//		Collections.sort(lista,new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {				
//				return o1.compareTo(o2);
//			}			
//		});
//		expresion lambda
//		 <parametros> -> <logica_evaluar>
//		(String o1, String o2)-> o1.compareTo(o2)
		
		Collections.sort(lista,(String o1, String o2)-> o1.compareTo(o2));		
		
		
		for (String element : lista) {
			System.out.println(element);
		}
	}
	public static void main(String[] args) {
		LambdaApp app = new LambdaApp();
		app.ordenar();
		
	}
	
}
