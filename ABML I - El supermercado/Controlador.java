package ActividadSupermercado;
import java.util.Scanner;

import EstudianteUsoArray.Estudiante;
public class Controlador {
	public static void main(String[] args) {
		int opcion;
		Electronica[] arrayEle = new Electronica[10];
		Alimento[] arrayAli = new Alimento[10];
		Ropa[] arrayRop = new Ropa[10];
 		do {
			Scanner lector = new Scanner(System.in);
			
			System.out.println("Bienvenido");
			System.out.println("Ingresa opcion deseada:");
			System.out.println("1- Alimento");
			System.out.println("2- Electronica");
			System.out.println("3- Ropa");
			System.out.println("4- Salir");
			opcion = lector.nextInt();
		switch (opcion) { // Switch General
			case 1: // CAso de ALimento
				System.out.println("|| ALIMENTO ||");
				do {
					System.out.println("Bienvenido");
					System.out.println("Ingresa opcion deseada:");
					System.out.println("1- Ingresar");
					System.out.println("2- Borrar");
					System.out.println("3- Modificar");
					System.out.println("4- Listar");
					System.out.println("5- Salir");
					opcion = lector.nextInt();
				
			switch (opcion ) { // El switch de Alimento
			case 1: //Ingresar 
				altaAlimento (arrayAli,lector);
				
				break; 
			case 2: // Borrar
				bajaAlimento (arrayAli,lector);
				break;
			case 3: // Modificar
				modifAlimento (arrayAli, lector);
				break;
			case 4: // Listar 
				listarAlimento (arrayAli);
				break;
			case 5: 
				System.out.println("Saliste de Alimento");
				break;
			}
				}while (opcion != 5); // Termina Switch Alimento
				break;
			case 2: // Caso de Electronica
				System.out.println("|| ELECTRONICA ||");
				do {
					System.out.println("Bienvenido");
					System.out.println("Ingresa opcion deseada:");
					System.out.println("1- Ingresar");
					System.out.println("2- Borrar");
					System.out.println("3- Modificar");
					System.out.println("4- Listar");
					System.out.println("5- Salir");
					opcion = lector.nextInt();
				
			switch (opcion ) { // El switch de Electronica
			case 1: //Ingresar
					altaElectronica (arrayEle, lector);
				break;
			case 2: //Borrar
					bajaElectronica (arrayEle, lector);
				break;
			case 3: //Modificar
					modifElectronica (arrayEle, lector);
				break;
			case 4: //listar
					listarElectronica (arrayEle);
				break;
			case 5:
				System.out.println("Saliste de Electronica");
				break;
			}
				}while (opcion != 5); // Termina Switch Electronica 
				break;
			case 3: // Caso de Ropa
				System.out.println("|| ROPA ||");
				do {
					System.out.println("Bienvenido");
					System.out.println("Ingresa opcion deseada:");
					System.out.println("1- Ingresar");
					System.out.println("2- Borrar");
					System.out.println("3- Modificar");
					System.out.println("4- Listar");
					System.out.println("5- Salir");
					opcion = lector.nextInt();
				
			switch (opcion ) { // El switch de Ropa
			case 1:
				altaRopa (arrayRop, lector);
				break;
			case 2:
				bajaRopa (arrayRop, lector);
				break;
			case 3:
				modifRopa (arrayRop, lector);
				break;
			case 4:
				listarRopa (arrayRop);
				break;
			case 5:
				System.out.println("Saliste de Ropa");
				break;
			}
				}while (opcion != 5); // Termina Switch Ropa
				break;
			case 4: 
				System.out.println("Saliste del programa");
				break;
			}
		}while (opcion != 4);
		
	
	}
	public static void altaAlimento(Alimento[] arrayAli, Scanner lector) {
		
		System.out.println("Cual es el numero del producto?");
			int numProducto = lector.nextInt();
		System.out.println("Cual es el precio?");
			int precio = lector.nextInt();
		System.out.println("Esta en oferta?");
			boolean oferta = lector.nextBoolean();
		System.out.println("Cual es el nombre del producto?");
			String nombre = lector.next();
		System.out.println("Cuando vence el alimento?");
			String vencimiento = lector.next();
		System.out.println("Cuantas calorias tiene?");
			int calorias = lector.nextInt();
		
		for(int i=0; i<arrayAli.length; i++) {
			if(arrayAli[i] == null) {
				arrayAli[i] = new Alimento(numProducto,precio,oferta,nombre,vencimiento,calorias);
				break;
			}
			}
			}	
	public static void bajaAlimento(Alimento[] arrayAli, Scanner lector) {
		System.out.println("Ingresa el numero de producto del Alimento: ");
		int numProducto = lector.nextInt();
		for(int i=0; i<arrayAli.length; i++) {
			if(arrayAli[i] != null && arrayAli[i].getNumProducto() == numProducto) {
				arrayAli[i] = null;
				break;
			}
			}
			}
	public static void modifAlimento(Alimento[] arrayAli, Scanner lector) {
		System.out.println("Ingresa el numero del producto a modificar: ");
		int numProducto = lector.nextInt();
		for(int i=0; i<arrayAli.length; i++) {
			if(arrayAli[i] != null && arrayAli[i].getNumProducto() == numProducto) {
				System.out.println("Producto encontrado");
				System.out.println("Ingresa el nuevo valor del Numero Electronico: ");
					int NnumProducto = lector.nextInt();
					arrayAli[i].setNumProducto(NnumProducto);
				break;
			}else {
				System.out.println("No se encontro ningun Alimento con ese numero !!");
			}
			}
			}
	public static void listarAlimento(Alimento[] arrayAli) {
		
		for(int i=0; i<arrayAli.length; i++) {
			if(arrayAli[i] != null) {
				System.out.print("Num Prodcuto:"+ arrayAli[i].getNumProducto());
				System.out.print(" Precio:"+ arrayAli[i].getPrecio());
				System.out.print(" Oferta?:"+ arrayAli[i].isOferta());
				System.out.print(" Nombre:"+ arrayAli[i].getNombre());
				System.out.print(" Vencimiento:"+ arrayAli[i].getVencimiento());
				System.out.println(" Calorias: "+arrayAli[i].getCalorias());
			}else {
				System.out.println("Pos N°" + i + "es null");
			}
			}
			}
	public static void altaElectronica(Electronica[] arrayEle, Scanner lector) {
		
		System.out.println("Cual es el numero del producto?");
			int numProducto = lector.nextInt();
		System.out.println("Cual es el precio?");
			int precio = lector.nextInt();
		System.out.println("Esta en oferta?");
			boolean oferta = lector.nextBoolean();
		System.out.println("Cual es el nombre del producto?");
			String nombre = lector.next();
		System.out.println("Cual es la marca Electronica?");
			String marcaElectronica = lector.next();
		System.out.println("Tiene bateria recargable?");
			boolean bateria = lector.nextBoolean();
		
		for(int i=0; i<arrayEle.length; i++) {
			if(arrayEle[i] == null) {
				arrayEle[i] = new Electronica(numProducto,precio,oferta,nombre,marcaElectronica, bateria);
				break;
			}
			}
			}
	public static void bajaElectronica(Electronica[] arrayEle, Scanner lector) {
		System.out.println("Ingresa el numero de producto del Electronico: ");
		int numProducto = lector.nextInt();
		for(int i=0; i<arrayEle.length; i++) {
			if(arrayEle[i] != null && arrayEle[i].getNumProducto() == numProducto) {
				arrayEle[i] = null;
				break;
			}
			}
			}
	public static void modifElectronica(Electronica[] arrayEle, Scanner lector) {
		System.out.println("Ingresa el numero del producto Electronico a modificar: ");
		int numProducto = lector.nextInt();
		for(int i=0; i<arrayEle.length; i++) {
			if(arrayEle[i] != null && arrayEle[i].getNumProducto() == numProducto) {
				System.out.println("Producto encontrado");
				System.out.println("Ingresa el nuevo valor: ");
					int NnumProducto = lector.nextInt();
					arrayEle[i].setNumProducto(NnumProducto);
				break;
			}else {
				System.out.println("No se encontro ningun Alimento con ese numero !!");
			}
			}
			}
	public static void listarElectronica(Electronica[] arrayEle) {
		
		for(int i=0; i<arrayEle.length; i++) {
			if(arrayEle[i] != null) {
				System.out.print("Num Prodcuto:"+ arrayEle[i].getNumProducto());
				System.out.print(" Precio:"+ arrayEle[i].getPrecio());
				System.out.print(" Oferta?:"+ arrayEle[i].isOferta());
				System.out.print(" Nombre:"+ arrayEle[i].getNombre());
				System.out.print(" Marca Electronica:"+ arrayEle[i].getMarcaElectronica());
				System.out.println(" Bateria recargable?: "+arrayEle[i].isBateria());
			}else {
				System.out.println("Pos N°" + i + "es null");
			}
			}
			}
	public static void altaRopa(Ropa[] arrayRop, Scanner lector) {
		
		System.out.println("Cual es el numero del producto?");
			int numProducto = lector.nextInt();
		System.out.println("Cual es el precio?");
			int precio = lector.nextInt();
		System.out.println("Esta en oferta?");
			boolean oferta = lector.nextBoolean();
		System.out.println("Cual es el nombre del producto?");
			String nombre = lector.next();
		System.out.println("Cual es el tipo de ropa?");
		 	String tipo = lector.next();
		System.out.println("Cual es el talle? ");
			String talle = lector.next();
		System.out.println("En que estado esta? ");
			String estado = lector.next();
		
		for(int i=0; i<arrayRop.length; i++) {
			if(arrayRop[i] == null) {
				arrayRop[i] = new Ropa(numProducto,precio,oferta,nombre,tipo, talle, estado);
				break;
			}
			}
			}
	public static void bajaRopa(Ropa[] arrayRop, Scanner lector) {
		System.out.println("Ingresa el numero de producto: ");
		int numProducto = lector.nextInt();
		for(int i=0; i<arrayRop.length; i++) {
			if(arrayRop[i] != null && arrayRop[i].getNumProducto() == numProducto) {
				arrayRop[i] = null;
				break;
			}
			}
			}
	public static void modifRopa(Ropa[] arrayRop, Scanner lector) {
		System.out.println("Ingresa el numero del producto de Ropa a modificar: ");
		int numProducto = lector.nextInt();
		for(int i=0; i<arrayRop.length; i++) {
			if(arrayRop[i] != null && arrayRop[i].getNumProducto() == numProducto) {
				System.out.println("Producto encontrado");
				System.out.println("Ingresa el nuevo valor: ");
					int NnumProducto = lector.nextInt();
					arrayRop[i].setNumProducto(NnumProducto);
				break;
			}
			}
			}
	public static void listarRopa(Ropa[] arrayRop) {
		
		for(int i=0; i<arrayRop.length; i++) {
			if(arrayRop[i] != null) {
				System.out.print("Num Prodcuto:"+ arrayRop[i].getNumProducto());
				System.out.print(" Precio:"+ arrayRop[i].getPrecio());
				System.out.print(" Oferta?:"+ arrayRop[i].isOferta());
				System.out.print(" Nombre:"+ arrayRop[i].getNombre());
				System.out.print(" Tipo Prenda:"+ arrayRop[i].getTipo());
				System.out.print(" Talle: "+arrayRop[i].getTalle());
				System.out.println(" Estado: "+arrayRop[i].getEstado());
			}else {
				System.out.println("Pos N°" + i + "es null");
			}
			}
			}
}
