package proyectoJava1.tema2.lambda.scopes;

import proyectoJava1.tema1.tema2.lambda.sintaxis.Operacion;

public class Scopes {
	private static double atributo1; //este es un atributo statico 
	private double atributo2; // este es un atributo global 
	
	public double probarLocalVariable() {
		 final double a3=8;		
//		esto tambien sirce
//		Operacion operacion = new Operacion() {
//			@Override
//			public double calcularPromedio(double a1, double a2) {				
//				return a1 +a2 +a3  ;
//			}			
//		};
		Operacion operacion = ( a1, a2)->{		
			return a1 +a2 + a3;
		};
		return operacion.calcularPromedio(45.2, 56.8);		
	} 
	
//	se puede alterar atributos staticos de clase 
	public double probarAtributosStaticVariables() {
//		los atributos que tengamos acá siempre se van a comportar como variables de tipo "final"
		 final double a3=8;
		Operacion operacion = ( a1, a2)->{	
			atributo1 = a1 + a2;
			atributo2 = atributo1;
			return atributo2;
		};
		return operacion.calcularPromedio(4, 5);		
	} 
	
//	se ha visto que las variables sean locales, globales  mas conocidas como 
//	atributos de tipo estático o no, tienen el mismo comportamiento que en un objecto anonimo
//	que se instancia atraves de una interfaz donde tenemos que implementar los metodos
//	
	
	public static void main(String[] args) {
		Scopes app = new Scopes();
		System.out.println(app.probarLocalVariable());
		
	}

}
