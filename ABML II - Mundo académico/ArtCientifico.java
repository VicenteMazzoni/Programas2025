package Editorial;

public class ArtCientifico extends Publicacion {
	private String fueCientifica;
	private int DOI, numCitas;
	public ArtCientifico(String titulo, String autor, String fecha, String fueCientifica, String numCitas, int dOI) {
		super(titulo, autor, fecha);
		this.fueCientifica = fueCientifica;
		numCitas = numCitas;
		DOI = dOI;
	}
	public String getFueCientifica() {
		return fueCientifica;
	}
	public void setFueCientifica(String fueCientifica) {
		this.fueCientifica = fueCientifica;
	}
	public int getDOI() {
		return DOI;
	}
	public void setDOI(int dOI) {
		DOI = dOI;
	}
	public int getNumCitas() {
		return numCitas;
	}
	public void setNumCitas(int numCitas) {
		this.numCitas = numCitas;
	}

	
}
