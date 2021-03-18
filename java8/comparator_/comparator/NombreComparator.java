package proyectoJava1.tema1.comparator;

import java.util.Comparator;

public class NombreComparator implements Comparator<Persona>{

	@Override
	public int compare(Persona per1, Persona per2) {
//		Persona per1 =  (Persona)o1;
//		Persona per2 =  (Persona)o1;
		return per1.getName().compareTo(per2.getName());		
	}

}
