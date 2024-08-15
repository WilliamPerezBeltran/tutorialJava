import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class LambdaApp{

	public void ordenar(){
		List<String> lista =  new ArrayList<>();
		lista.add("mitocode");
		lista.add("code");
		lista.add("mito");

		// jdk < 1.7
		// Collections.sort(lista, new Comparator<String>(){
		// 	@Override
		// 	public int compare(String o1,String o2){
		// 		return o1.compareTo(o2);
		// 	}
		// });

		// Lambda
		Collections.sort(lista,(String p1,String p2)-> p1.compareTo(p2));

		for (String element : lista){
			System.out.println(element);
		}
	}

	public static void main(String[] args){
		LambdaApp app = new LambdaApp();
		app.ordenar();
		// System.out.println(app.ordenar());
	}
}
