import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class Principal {
 
    public static void main(String[] args) {
     

		List<Map<String, String>> lista= new ArrayList<>();
		Map<String,String> mapa= new HashMap<>();
		mapa.put("clave1", "valor1");
		mapa.put("llave2","valor2");
		mapa.put("llave3","valor3");
		lista.add(mapa);
         
        lista.forEach(System.out::println);
 
 
    }
 
}
