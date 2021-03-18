package proyectoJava1.tema1.tema2.lambda.sintaxis;


public class Sintaxis {
	public void probarSintaxis() {
//		sintaxis 1:
//		Operacion operacion = (double x, double y)->((x+y)/2);
			
//		sintaxis 2:
//		Operacion operacion = (double x, double y) -> {return (x+y/2);};

//		sintaxis 3: agregando llaves y return 
//		cuando es necesario agregar varias lineas
//		Operacion operacion = (double x, double y) -> {
//			double a = 2.0;
//			System.out.println(a);
//			return (x+y/2);
//		};

//		sintaxis 4: sin tipo de parametro
		Operacion operacion = ( x, y) -> {return (x+y/2);};
		

					
		System.out.println(operacion.calcularPromedio(25.3,25.7));
	}	
	
	public static void main(String[] args) {
		Sintaxis app = new Sintaxis();
		app.probarSintaxis();
		
		
	}
}
