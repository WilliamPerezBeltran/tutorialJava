package proyectoJava1.tema4.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import proyectoJava1.tema3.map.App;

public class StreamApp {
	private List<String> lista;
	private List<String> numeros;
	
	public StreamApp() {
		lista = new ArrayList<>();
		lista.add("pepito");
		lista.add("rodolfo");
		lista.add("camilio");	
		lista.add("andres");
		
		numeros = new ArrayList<>();
		numeros.add("1");
		numeros.add("2");
		numeros.add("3");
		numeros.add("4");		
	}
	
	public void filtrar() {
		List<String> z ;
//		lista.stream().filter(x->x.startsWith("p")).forEach(x -> System.out.println(x));
//		z = lista.stream().filter(x->x.startsWith("p")).forEach(x -> {return x};);
		z = lista.stream().filter(x->x.startsWith("p")).collect(Collectors.toList());
		System.out.println(z);				
	}
	
	
	public void ordenar(){
		//lista.stream().sorted().forEach(System.out::println);
		lista.stream().sorted((x,y)-> y.compareTo(x)).forEach(System.out::println);
	}
	
	public void transformar(){
		//lista.stream().map(String::toUpperCase).forEach(System.out::println);
		/*for(String x : numeros){
			int num = Integer.parseInt(x) + 1;
			System.out.println(num);
		}*/
		numeros.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println);
	}
	
	public void limitar(){
		lista.stream().limit(2).forEach(System.out::println);
	}
	
	public void contar(){
		long x = lista.stream().count();
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		StreamApp app = new  StreamApp();
		app.filtrar();
	}

}
