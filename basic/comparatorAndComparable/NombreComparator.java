// import java.util.Comparator;

// public Class NombreComparator implements Comparator{
// 	@Override
// 	public int compare(Object obj1, Object obj2) {
// 		Persona per1 = (Persona)obj1; //se le hace un casteo de tipo persona
// 		Persona per2 = (Persona)obj2;
// 		// hago la comparacion entre ambas cadenas de texto
// 		// y me retorna numero positivo, cero o negatiov
// 		return per1.getName().compareTo(per2.getName());
// 	}

// }


import java.util.Comparator;

public Class NombreComparator implements Comparator<Persona>{
	@Override
	public int compare(Persona per1, Persona per2) {
		return per1.getName().compareTo(per2.getName());
	}

}