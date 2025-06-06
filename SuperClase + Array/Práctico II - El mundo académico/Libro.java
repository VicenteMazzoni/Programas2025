package Editorial;

public class Libro extends Publicacion{
	private String genLiterario;
	private int ISBN, capitulos;
	public Libro(String titulo, String autor, String fecha, String genLiterario, int iSBN, int capitulos) {
		super(titulo, autor, fecha);
		this.genLiterario = genLiterario;
		ISBN = iSBN;
		this.capitulos = capitulos;
	}
	public String getGenLiterario() {
		return genLiterario;
	}
	public void setGenLiterario(String genLiterario) {
		this.genLiterario = genLiterario;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public int getCapitulos() {
		return capitulos;
	}
	public void setCapitulos(int capitulos) {
		this.capitulos = capitulos;
	}
	
	
}
