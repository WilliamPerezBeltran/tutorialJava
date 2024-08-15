/**
 * 
 */
import java.util.*;
/**
 * @author varo0
 *
 */
public class Interfaz {
	private static Departamento dept;
	/**
	 * 
	 */
	public Interfaz() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean salir = false;
		int opcion;
		System.out.println("Escriba el nombre del depto:");
		String nomD=s.next();
		
		dept=new Departamento(nomD); 
		while (!salir) {
			System.out.println("1.Opcion 1");
			System.out.println("2.Opcion 2");
			System.out.println("3.Opcion 3");
			System.out.println("4.Opcion 4");
			System.out.println("5.Opcion 5");
			System.out.println("6.Opcion 6");
			System.out.println("7.Salir");
			System.out.println("Escriba una de las opciones:");
			opcion=s.nextInt();
			switch (opcion) {
			case 1:
				//agregar Curso al Depto
				System.out.println("Escriba el nombre del curso:");
				String nomC=s.next();
				System.out.println("Escriba el id del curso:");
				String ID=s.next();
				int id = Integer.parseInt(ID);
				dept.agregarCurso(nomC,id);

				System.out.println("El departamento es:"+dept);
			break;
			case 2:
				//agregar profesor a Curso
				System.out.println("Escriba el nombre del curso:");
				nomC=s.next();
				System.out.println("Escriba el nombre del profesor:");
				String nomP=s.next();
				System.out.println("Escriba el titulo del profesor:");
				String tit=s.next();
				
				dept.agregarProfesor(nomC,nomP,tit);

				System.out.println("El departamento es:"+dept);
			break;
			case 3:
				//agregar estudiante a Curso
				System.out.println("Escriba el nombre del curso:");
				nomC=s.next();
				System.out.println("Escriba el nombre del estudiante:");
				String nomE=s.next();
				System.out.println("Escriba la fecha de nacimiento(aaaa-mm-dd):");
				String fn=s.next();
				System.out.println("Escriba el documento de identidad del estudiante:");
				String doc=s.next();
				System.out.println("Escriba la carrera del estudiante:");
				String car=s.next();
						
				dept.agregarEstudiante(nomC,nomE,fn,doc,car);

				System.out.println("El departamento es:"+dept);
			break;
			case 4:
				//agregar nota a Estudiante
				System.out.println("Escriba el nombre del curso:");
				nomC=s.next();
				System.out.println("Escriba el  ID del estudiante:");				 
				doc=s.next();
				System.out.println("Escriba la cantidad de notas a agregar");
		        String  NumeroNotas = s.next();
		        int numeroNotas = Integer.parseInt(NumeroNotas);
		        for (int i = 0; i < numeroNotas; i++) {
		          System.out.println("Escriba la nota del estudiante");
		          String Nota = s.next();
		          int nota = Integer.parseInt(Nota);
		          dept.agregarNota(nomC, doc, nota);
		        }

				System.out.println("El departamento es:"+dept);
		    break;
			case 5:
				// calcular promedio del Estudiante 	
		        System.out.println("Escriba el nombre del curso:");
				nomC=s.next();
		        System.out.println("Escriba el  ID del estudiante:");				 
				doc=s.next();
				
				dept.calcularpromedio(nomC,doc);
				
				System.out.println("El departamento es:"+dept);
			break;
			case 6: 
				// calcular promedio del Estudiante 	
		        System.out.println("Escriba el nombre de la carrera:");
				car=s.next();
		       
				
				String nombres= dept.estudiantescarrera(car);
				System.out.println("los nombres son : " + nombres);
			break;
			case 7:
				salir=true; 
			break;
			default: 
				 System.out.println("Solo números entre 1 y 7");
					
			}
		}
	}

}
