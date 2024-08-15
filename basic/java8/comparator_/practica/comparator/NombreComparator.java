package proyectoJava1.tema1.practica.comparator;

import java.util.Comparator;

public class NombreComparator implements Comparator<Persona>{
	@Override
	public int compare(Persona persona1, Persona persona2) {		
		return persona1.getName().compareTo(persona2.getName()) ;
	}
}
