package ActividadSupermercado;

public class Alimento extends Producto{
	private String vencimiento;
	private int calorias;
	Alimento(int numProducto, int precio, boolean oferta, String nombre, String vencimiento, int calorias) {
		super(numProducto, precio, oferta, nombre);
		this.vencimiento = vencimiento;
		this.calorias = calorias;
	}
	public String getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}
	public int getCalorias() {
		return calorias;
	}
	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}
	

}
