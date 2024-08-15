package proyectoJava1.tema2.defaultMethod;

public interface PersonaA {
	
	public void caminar();
	
	default public void hablar(){
		System.out.println("Habla PersonaA");	
	};

}
