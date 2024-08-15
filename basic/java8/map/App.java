package proyectoJava1.tema3.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class App {
	private Map<Integer, String> map;
	
	public void poblar() {
		map = new HashMap<>();
		map.put(1, "pepito");
		map.put(2, "oscar");
		map.put(3, "pedro");
				
	}
	
	public void imprivir_v7(){
		for (Entry<Integer, String> e : map.entrySet()) {
			System.out.println("Llave: "+e.getKey()+" --"+" Valor: "+e.getValue());			
		}
	}
	public void imprivir_v8(){
//		BiConsumer es una expresionlambda que acepta dos parametros
		map.forEach((k,v)->System.out.println("Llave: "+k+" --"+" Valor: "+v));		
//		map.entrySet().stream().forEach(System.out::println);
	}
	
	public void insertarSiAusente() {		
		map.putIfAbsent(4, "jaime");
	}
	
	public void operarSiPresente() {		
		map.computeIfPresent(3, (k,v)->k+v);
		System.out.println(map.get(3));
	}
	
	
	public void obtenerOrPredeterminado() {		
//		si el numero 5 no tiene algun valor asociado 
//		le asigna ese valor por defecto 
		String valor = map.getOrDefault(5, "valor por defecto");
		System.out.println(valor);
	}
	public void recolectar() {		
		Map<Integer, String> mapaRecolectado =  map.entrySet().stream()
				.filter(e->e.getValue().contains("pe"))
				.collect(Collectors.toMap(p -> p.getKey(),p -> p.getValue()));
		
		mapaRecolectado.forEach((k,v)->System.out.println("Llave: "+k+" --"+" Valor: "+v));
	
	}
	
	public static void main(String[] args) {
		App app = new  App();
		app.poblar();
//		app.insertarSiAusente();
//		
//		System.out.println("------version_7------");
//		app.imprivir_v7();
//		
//		System.out.println("------version_8------");
//		app.imprivir_v8();
//		app.obtenerOrPredeterminado();
		app.recolectar();
		
		
		
	}

}
