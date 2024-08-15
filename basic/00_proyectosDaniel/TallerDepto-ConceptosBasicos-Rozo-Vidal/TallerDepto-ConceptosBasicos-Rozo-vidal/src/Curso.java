import java.util.Arrays;
/**
 * 
 */

/**
 * @author varo0
 *
 */
public class Curso {
	private String nombre;
	private int ID;
	private Profesor prof;
	private Estudiante[] est; 
	private int centE=0;
	private static final int numE=5;
	/**
	 * 
	 */
	public Curso() {
		est =new Estudiante[numE];
	}
	public Curso (String nombre, int id) {
		this.nombre=nombre;
		ID=id;
		est= new Estudiante[numE];
	}
	public Curso (String nombre, int id, String nomP, String titP) {
		this.nombre=nombre;
		ID=id;
		prof= new Profesor(nomP,titP);
		est=new Estudiante[numE];
	}
	
	public void agregarProfesor (String nomP, String tit) {
		prof=new Profesor (nomP, tit);
	}
	public Estudiante buscarEstudiante(String docId) {
		for(Estudiante e:est) {
			if ((e!=null)&& (e.getDocid().equalsIgnoreCase(docId))) {
				return e;
			}
		}
		return null;
	}
	public void agregarEstudiante(String nomE,String fn , String doc,String car) {
		Estudiante e =buscarEstudiante (doc);
		if (e==null) {
			e =new Estudiante(nomE,fn,doc,car);
			if(centE<numE) {
			est[centE]=e;
			centE++;
			}
		}
	}
	
	public void agregarNota(String doc, int not)
	{
		 // buscar estudiante
	    Estudiante e = buscarEstudiante(doc);
	    // si no lo encuentra, lo adiciono
	    if(e!=null)
	    {
	      e.agregarNota(not);
	    }
	 }
	
	public void calcularpromedio(String doc){
		// buscar estudiante
	    Estudiante e = buscarEstudiante(doc);
	    // si no lo encuentra, lo adiciono
	    if(e!=null)
	    {
	      e.calcularpromedio();
	    }
		
	}
	
	public String estudiantescarrera(String car) {
		String nombres = "";
	    for (int i = 0; i < centE; i++) 
	    {
	      if(est[i].getCarrera().equalsIgnoreCase(car))
	      {
	        nombres = nombres + est[i].getNombre()+",";
	      }
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
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}
	/**
	 * @return the prof
	 */
	public Profesor getProf() {
		return prof;
	}
	/**
	 * @param prof the prof to set
	 */
	public void setProf(Profesor prof) {
		this.prof = prof;
	}
	/**
	 * @return the est
	 */
	public Estudiante[] getEst() {
		return est;
	}
	/**
	 * @param est the est to set
	 */
	public void setEst(Estudiante[] est) {
		this.est = est;
	}
	@Override
	public String toString() {
		return "Curso [nombre=" + nombre + ", ID=" + ID + ", prof=" + prof + ", est=" + Arrays.toString(est) + "]"; 
	}
	

}
