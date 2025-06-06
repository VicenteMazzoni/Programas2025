package ActividadSupermercado;
import java.util.Scanner;
public class Controlador {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
	System.out.println("-- Electronica --");
		Electronica ele1 = new Electronica (0,0,false,null, null, false );
	System.out.println("Cual es el numero del producto?");
		ele1.setNumProducto(lector.nextInt());
	System.out.println("Cual es el precio?");
		ele1.setPrecio(lector.nextInt());
	System.out.println("Esta en oferta?");
		ele1.setOferta(lector.nextBoolean());
	System.out.println("Cual es el nombre del producto?");
		ele1.setNombre(lector.next());
	System.out.println("Cual es la marca electronica?");
		ele1.setMarcaElectronica(lector.next());
	System.out.println("El producto tiene bateria recargable?");
		ele1.setBateria(lector.nextBoolean());
		
	System.out.println("Numero Producto: "+ele1.getNumProducto()+"\n"+"El precio: "+ele1.getPrecio()+"\n"+"Esta en oferta? : "+ele1.isOferta()+"\n"+"Nombre producto: "+ele1.getNombre()+"\n"+"Marca Electronica: "+ele1.getMarcaElectronica()+"\n"+"Tiene bateria recargable? "+ele1.isBateria());
		
	System.out.println("-------------");

		System.out.println("-- Alimento --");
		Alimento ali1 = new Alimento (0,0,false,null,null,0);
	System.out.println("Cual es el numero del producto?");
		ali1.setNumProducto(lector.nextInt());
	System.out.println("Cual es el precio?");
		ali1.setPrecio(lector.nextInt());
	System.out.println("Esta en oferta?");
		ali1.setOferta(lector.nextBoolean());
	System.out.println("Cual es el nombre del producto?");
		ali1.setNombre(lector.next());
	System.out.println("Cuando vence el alimento?");
		ali1.setVencimiento(lector.next());
	System.out.println("Cuantas calorias tiene?");
		ali1.setCalorias(lector.nextInt());
		
	System.out.println("Numero Producto: "+ali1.getNumProducto()+"\n"+"El precio: "+ali1.getPrecio()+"\n"+"Esta en oferta? : "+ali1.isOferta()+"\n"+"Nombre producto: "+ali1.getNombre()+"\n"+"Vencimiento: "+ali1.getVencimiento()+"\n"+"Calorias: "+ali1.getCalorias());
		
		System.out.println("-------------");
		System.out.println("-- Ropa --");
		Ropa rop1 = new Ropa (0,0,false,null,null,null,null);
	System.out.println("Cual es el numero del producto?");
		rop1.setNumProducto(lector.nextInt());
	System.out.println("Cual es el precio?");
		rop1.setPrecio(lector.nextInt());
	System.out.println("Esta en oferta?");
		rop1.setOferta(lector.nextBoolean());
	System.out.println("Cual es el nombre del producto?");
		rop1.setNombre(lector.next());
	System.out.println("Cual es la prenda?");
		rop1.setTipo(lector.next());
	System.out.println("Cual es el talle?");
		rop1.setTalle(lector.next());
	System.out.println("En que estado esta?");
		rop1.setEstado(lector.next());
	
	System.out.println("Numero Producto: "+rop1.getNumProducto()+"\n"+"El precio: "+rop1.getPrecio()+"\n"+"Esta en oferta? : "+rop1.isOferta()+"\n"+"Nombre producto: "+rop1.getNombre()+"\n"+"Prenda: "+rop1.getTipo()+"\n"+"Talle: "+rop1.getTalle()+"\n"+"Estado: "+rop1.getEstado());

	
	
	
	}

}
