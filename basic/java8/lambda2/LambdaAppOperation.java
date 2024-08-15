package proyectoJava1.tema2.lambda;

public class LambdaAppOperation {
	public void ordenar() {
		
	}
	
//	PASO 1: Sin utilizar lambda normal con interfaces
//	ENFOQUE IMPERATIVO: COMO HACER LA IMPLEMENTACION
	
//	public void calcular() {		
//		Operacion operacion = new Operacion() {
//			@Override
//			public double calcularPromedio(double n1, double n2) {				
//				return (n1+n2)/2;
//			}			
//		};
//		System.out.println(operacion.calcularPromedio(12.5, 78.5));		
//	}
	
	
//	PASO 2:
//	ENFOQUE DECLARATIVO: QUÉ ES LO QUE NECESITO
	public void calcular() {
		Operacion operacion = (double x, double y)->(x+y)/2;
		System.out.println(operacion.calcularPromedio(12.5, 78.5));		
	}
//	y ahora queda mas leible y facil utilizando lambda 
//	recuerde: Una expresión lambda son métodos anónimos que no necesitan un identificador para ser invocado
		
	
	
	
	
	public static void main(String[] args) {
		LambdaAppOperation app = new LambdaAppOperation();
		app.calcular();
		
	}

}
