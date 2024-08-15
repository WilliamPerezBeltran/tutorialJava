package proyectoJava1.tema1.comparator;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;


public class App {
	public static void main(String[] args) {
        List<Persona> lista = new ArrayList<>();
        Persona player0 = new Persona(1, "Aaa", 2);
        Persona player1 = new Persona(1, "Adriana", 0);
        Persona player2 = new Persona(2, "Valentina",6);
        Persona player3 = new Persona(3, "Faro", 4);
        Persona player4 = new Persona(4, "William", 13);
        Persona player5 = new Persona(4, "Sandra", 9);
        lista.add(player0);
        lista.add(player2);
        lista.add(player1);
        lista.add(player3);
        lista.add(player4);
        lista.add(player5);
        
//        esta es la forma si implementamos el fuera de la clase 
//        Collections.sort(lista, new NombreComparator());
//
//        for (Persona p : lista){
//            System.out.println(p.getName());
//        }
        
        
//        emplementarlo dentro de la clase 
        Collections.sort(lista,new Comparator<Persona>() {
			@Override
			public int compare(Persona instanciaPersona1, Persona instanciaPersona2) {
				int rpta = 0;
				if(instanciaPersona1.getAge() > instanciaPersona2.getAge()) {
					rpta = 1;
				}else if(instanciaPersona1.getAge() < instanciaPersona2.getAge()){
					rpta = -1;
				}else {
					rpta = 0;
				}
				return rpta;				
			}
		});
        
        for (Persona p : lista) {
        	System.out.println(p.getName());        	
        }
        
        
    }

}
