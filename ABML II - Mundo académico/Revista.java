package Editorial;

public class Revista extends Publicacion {

	private String edicion, perioridad, seccion;

	public Revista(String titulo, String autor, String fecha, String edicion, String perioridad, String seccion) {
		super(titulo, autor, fecha);
		this.edicion = edicion;
		this.perioridad = perioridad;
		this.seccion = seccion;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

	public String getPerioridad() {
		return perioridad;
	}

	public void setPerioridad(String perioridad) {
		this.perioridad = perioridad;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
}
