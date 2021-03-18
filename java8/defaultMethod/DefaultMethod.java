package proyectoJava1.tema2.defaultMethod;

public class DefaultMethod implements PersonaA, PersonaB{
	@Override
	public void caminar() {
		System.out.println("Hola coders");	
	}
	
	@Override
	public void hablar() {	
//		esta es la forma para decirle a java que implemente el metodo default de la interfaz
//		sirve:
//		PersonaB.super.hablar();
//		PersonaA.super.hablar();
		System.out.println("java java default method");	
	}

	public static void main(String[] args) {
		DefaultMethod app = new DefaultMethod();
		app.caminar();
		app.hablar();			
	}
}
