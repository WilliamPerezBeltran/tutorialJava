import java.util.Arrays;

/**
 * 
 */

/**
 * @author varo0
 *
 */
public class Estudiante {
	private String nombre;
	private String fechaNac;
	private String docid;
	private String carrera; 
	private int[] notas; 
	private int centN=0;
	private static final int numN=10;
	private int suma=0;
	private int promedio=0;
	/**
	 * 
	 */
	public Estudiante() {
		notas=new int[numN];
	}
	public Estudiante(String nom, String fn, String dl, String car) {
		nombre=nom; 
		fechaNac=fn;
		docid=dl;
		carrera=car;
		notas=new int[numN];
	}
	  public void agregarNota(int nota)
	  {
	    if(centN<numN) {
	      notas[centN]=nota;
	    centN++;
	    }
	  }
	  public void calcularpromedio()
	  {
	    for(int i = 0; i < numN; i++)
	    {
	       suma=suma+notas[i];
	    }
	    promedio=suma/numN;
	  }
	  
	  public  String estudiantescarrera(String car) {
			return getCarrera();
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
	 * @return the fechaNac
	 */
	public String getFechaNac() {
		return fechaNac;
	}
	/**
	 * @param fechaNac the fechaNac to set
	 */
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	/**
	 * @return the docid
	 */
	public String getDocid() {
		return docid;
	}
	/**
	 * @param docid the docid to set
	 */
	public void setDocid(String docid) {
		this.docid = docid;
	}
	/**
	 * @return the carrera
	 */
	public String getCarrera() {
		return carrera;
	}
	/**
	 * @param carrera the carrera to set
	 */
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	/**
	 * @return the notas
	 */
	public int[] getNotas() {
		return notas;
	}
	/**
	 * @param notas the notas to set
	 */
	public void setNotas(int[] notas) {
		this.notas = notas;
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", fechaNac=" + fechaNac + ", docid=" + docid + ", carrera=" + carrera
				+ ", notas=" + Arrays.toString(notas) + "]"+ ", promedio="+ promedio;
	}
	
	
	
	
}
