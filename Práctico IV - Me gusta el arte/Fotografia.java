package ObrasArte;

public class Fotografia extends ObraArte{
	String camara, resolucion;

	public Fotografia(String titulo, String autor, int año, String camara, String resolucion) {
		super(titulo, autor, año);
		this.camara = camara;
		this.resolucion = resolucion;
	}

	public String getCamara() {
		return camara;
	}

	public void setCamara(String camara) {
		this.camara = camara;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	
	
	
}
