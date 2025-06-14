package ActividadSupermercado;

public class Producto {

	private int numProducto, precio;
	private boolean oferta;
	private String nombre;
		public Producto (int numProducto, int precio, boolean oferta, String nombre) {
		this.numProducto = numProducto;
		this.precio = precio;
		this.oferta = oferta;
		this.nombre = nombre;
		}
		public int getNumProducto() {
			return numProducto;
		}
		public void setNumProducto(int numProducto) {
			this.numProducto = numProducto;
		}
		public int getPrecio() {
			return precio;
		}
		public void setPrecio(int precio) {
			this.precio = precio;
		}
		public boolean isOferta() {
			return oferta;
		}
		public void setOferta(boolean oferta) {
			this.oferta = oferta;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		
		
	}


