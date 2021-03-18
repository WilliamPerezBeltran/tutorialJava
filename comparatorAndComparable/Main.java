import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

class Main{
	public static void main(String[] args) {
        List<Persona> lista = new ArrayList<>();
        Persona player1 = new Persona(1, "John", 20);
        Persona player2 = new Persona(2, "Roger", 22);
        Persona player3 = new Persona(3, "Steven", 24);
        lista.add(player1);
        lista.add(player2);
        lista.add(player3);
        
        Collections.sort(lista, new NombreComparator());

        for (Persona p : lista){
            System.out.println(p.getName());
        }
    }

}