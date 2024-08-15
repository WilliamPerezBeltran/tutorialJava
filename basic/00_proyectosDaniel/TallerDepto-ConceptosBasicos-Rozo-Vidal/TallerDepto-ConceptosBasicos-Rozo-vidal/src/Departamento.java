import java.util.Arrays;

/**
 * 
 */

/**
 * @author varo0
 *
 */
public class Departamento {
	private String nombre;
	private Curso[] cursos;
	private int centC=0;
	private static final int numC=5;
	/**
	 * 
	 */
	public Departamento() {
		cursos=new Curso[numC];
	}
	public Departamento (String nombre) {
		this.nombre=nombre;
		cursos=new Curso[numC];
	}
	public void agregarCurso(String nomC, int id) {
		Curso c=new Curso(nomC, id);
		if(centC<numC)
		cursos[centC]=c;
		centC++;
	}
	public void agregarProfesor(String nomC,String nomP,String tit) {
	    //buscar el curso de nombre nomC
		Curso c=buscarCurso(nomC);
		//pedirle al curso que agregue el profesor 
		if (c!=null) {
		c.agregarProfesor( nomP, tit);
		}
	}
	public Curso buscarCurso(String nomC) {
		for(Curso c:cursos) {
			if (c!=null&& c.getNombre().equalsIgnoreCase(nomC)) {
				return c;
			}
		}
		   return null;
	}
	public void agregarEstudiante( String nomC, String nomE,String fn,String doc,String car) {
		  //buscar el curso de nombre nomC
				Curso c=buscarCurso(nomC);
		//pedirle al curso que agregue el estudiante 
				if (c!=null) {
				c.agregarEstudiante(nomE,fn,doc,car);
	}
}
	public void agregarNota(String nomC,String doc,int not) {
		//buscar el curso de nombre nomC
		Curso c=buscarCurso(nomC);
		//pedirle al curso que agregue la nota 
		if (c!=null) {
			 if(c.buscarEstudiante(doc)!=null) {
			        c.agregarNota(doc,not);
			        }
	}
	}
	public void calcularpromedio(String nomC, String doc) {
		//buscar el curso de nombre nomC
				Curso c=buscarCurso(nomC);
				//pedirle al curso que agregue la nota 
				if (c!=null) {
					 if(c.buscarEstudiante(doc)!=null) {
					        c.calcularpromedio(doc);
					        }
			}
	}
	public  String estudiantescarrera(String car) {
		String nombres=null;
		for(Curso c: cursos ) {
			 nombres=c.estudiantescarrera(car);	
	}
		return nombres;
		
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the cursos
	 */
	public Curso[] getCursos() {
		return cursos;
	}
	/**
	 * @param cursos the cursos to set
	 */
	public void setCursos(Curso[] cursos) {
		this.cursos = cursos;
	}
	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + ", "
				+ "cursos=" + Arrays.toString(cursos) + "]"
				+ "El numero de cursos es:"+centC;
	}

}
