package ObrasArte;

public class Escultura extends ObraArte {

	String material, tipEsculpido;

	public Escultura(String titulo, String autor, int año, String material, String tipEsculpido) {
		super(titulo, autor, año);
		this.material = material;
		this.tipEsculpido = tipEsculpido;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTipEsculpido() {
		return tipEsculpido;
	}

	public void setTipEsculpido(String tipEsculpido) {
		this.tipEsculpido = tipEsculpido;
	}

	
	
	
	
}
