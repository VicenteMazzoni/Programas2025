package ObrasArte;

public class Pintura extends ObraArte {
	String tipPintura;
	int tamHoja;
	
	public Pintura(String titulo, String autor, int año, String tipPintura, int tamHoja) {
		super(titulo, autor, año);
		this.tipPintura = tipPintura;
		this.tamHoja = tamHoja;
	}
	public String getTipPintura() {
		return tipPintura;
	}
	public void setTipPintura(String tipPintura) {
		this.tipPintura = tipPintura;
	}
	public int getTamHoja() {
		return tamHoja;
	}
	public void setTamHoja(int tamHoja) {
		this.tamHoja = tamHoja;
	}
	
	
	
	
	
}
