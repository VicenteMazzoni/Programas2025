package ActividadSupermercado;

public class Electronica extends Producto{

	private String marcaElectronica;
	private boolean bateria;
	Electronica(int numProducto, int precio, boolean oferta, String nombre, String marcaElectronica,
			boolean bateria) {
		super(numProducto, precio, oferta, nombre);
		this.marcaElectronica = marcaElectronica;
		this.bateria = bateria;
	}
	public String getMarcaElectronica() {
		return marcaElectronica;
	}
	public void setMarcaElectronica(String marcaElectronica) {
		this.marcaElectronica = marcaElectronica;
	}
	public boolean isBateria() {
		return bateria;
	}
	public void setBateria(boolean bateria) {
		this.bateria = bateria;
	}
}
