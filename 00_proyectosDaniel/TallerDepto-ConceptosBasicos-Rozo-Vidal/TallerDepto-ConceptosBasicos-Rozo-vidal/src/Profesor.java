/**
 * 
 */

/**
 * @author varo0
 *
 */
public class Profesor {
	private String nombre; 
	private String titulo;
	/**
	 * 
	 */
	public Profesor() {
		// TODO Auto-generated constructor stub
	}

	public Profesor(String nom, String tit) {
		nombre=nom;
		titulo=tit;
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
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", titulo=" + titulo + "]";
	}
	
}
