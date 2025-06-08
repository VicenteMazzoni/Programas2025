package ObrasArte;

public class ObraArte {
	String titulo, autor;
	int año;
	public ObraArte(String titulo, String autor, int año) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.año = año;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	
	
	
}
