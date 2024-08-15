package proyectoJava1.tema1.practica.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Persona> lista = new ArrayList<>();
		lista.add(new Persona(1,"william",0));
		lista.add(new Persona(2,"rocio",3));
		lista.add(new Persona(3,"mama",2));
		lista.add(new Persona(4,"aa",5));
		Collections.sort(lista,new NombreComparator());
		
		for (Persona p: lista) {
			System.out.println(p.getName());		
		}
		
		
	}
	

}
