package ActividadSupermercado;

public class Ropa extends Producto{
	private String tipo, talle, estado;

	Ropa(int numProducto, int precio, boolean oferta, String nombre, String tipo, String talle, String estado) {
		super(numProducto, precio, oferta, nombre);
		this.tipo = tipo;
		this.talle = talle;
		this.estado = estado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTalle() {
		return talle;
	}

	public void setTalle(String talle) {
		this.talle = talle;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
