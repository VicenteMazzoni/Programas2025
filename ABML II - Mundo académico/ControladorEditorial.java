package Editorial;
import java.util.Scanner;

import ActividadSupermercado.Alimento;
public class ControladorEditorial {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		int opcion;
		Libro[] arrayLib = new Libro[10];
		Revista[] arrayRev = new Revista[10];
		ArtCientifico[] arrayCie = new ArtCientifico[10];
 		do {
			
			System.out.println("Bienvenido");
			System.out.println("Ingresa opcion deseada:");
			System.out.println("1- Libro");
			System.out.println("2- Revista");
			System.out.println("3- Articulo Cientifico");
			System.out.println("4- Salir");
			opcion = lector.nextInt();
		switch (opcion) { // Switch General
			case 1: // CAso de Libro
				System.out.println("|| LIBRO ||");
				do {
					System.out.println("Bienvenido");
					System.out.println("Ingresa opcion deseada:");
					System.out.println("1- Ingresar");
					System.out.println("2- Borrar");
					System.out.println("3- Modificar");
					System.out.println("4- Listar");
					System.out.println("5- Salir");
					opcion = lector.nextInt();
				
			switch (opcion ) { // El switch de Libro
			case 1: //Ingresar 
				altaLibro (arrayLib,lector);
				
				break; 
			case 2: // Borrar
				bajaLibro (arrayLib,lector);
				break;
			case 3: // Modificar
				modifLibro (arrayLib, lector);
				break;
			case 4: // Listar 
				listarLibro (arrayLib);
				break;
			case 5: 
				System.out.println("Saliste de Libro");
				break;
			}
				}while (opcion != 5); // Termina Switch Libro
				break;
			case 2: // Caso de Revista
				System.out.println("|| REVISTA ||");
				do {
					System.out.println("Bienvenido");
					System.out.println("Ingresa opcion deseada:");
					System.out.println("1- Ingresar");
					System.out.println("2- Borrar");
					System.out.println("3- Modificar");
					System.out.println("4- Listar");
					System.out.println("5- Salir");
					opcion = lector.nextInt();
				
			switch (opcion ) { // El switch de Revsita
			case 1: //Ingresar
					altaRevista (arrayRev, lector);
				break;
			case 2: //Borrar
					bajaRevista (arrayRev, lector);
				break;
			case 3: //Modificar
					modifRevista (arrayRev, lector);
				break;
			case 4: //listar
					listarRevista (arrayRev);
				break;
			case 5:
				System.out.println("Saliste de Revsita");
				break;
			}
				}while (opcion != 5); // Termina Switch Revista
				break;
			case 3: // Caso de Articulo Cientifico
				System.out.println("|| ARTICULO CIENTIFICO ||");
				do {
					System.out.println("Bienvenido");
					System.out.println("Ingresa opcion deseada:");
					System.out.println("1- Ingresar");
					System.out.println("2- Borrar");
					System.out.println("3- Modificar");
					System.out.println("4- Listar");
					System.out.println("5- Salir");
					opcion = lector.nextInt();
				
			switch (opcion ) { // El switch de Articulo Cientifico
			case 1:
				altaArtCientifico (arrayCie, lector);
				break;
			case 2:
				bajaArtCientifico (arrayCie, lector);
				break;
			case 3:
				modifArtCientifico (arrayCie, lector);
				break;
			case 4:
				listarArtCientifico (arrayCie);
				break;
			case 5:
				System.out.println("Saliste de Ropa");
				break;
			}
				}while (opcion != 5); // Termina Switch Articulo Cientifico
				break;
			case 4: 
				System.out.println("Saliste del programa");
				break;
			}
		}while (opcion != 4);
		

		}
	public static void altaLibro(Libro[] arrayLib, Scanner lector) {
		
		System.out.println("Cual es el titulo?");
			String titulo = lector.next();
		System.out.println("Quien es el autor?");
			String autor = lector.next();
		System.out.println("En que fecha se publicó?");
			String fecha = lector.next();
		System.out.println("Cual es el genero literario?");
			String genLiterario = lector.next();
		System.out.println("Cual es el codigo ISBN?");
			int iSBN = lector.nextInt();
		System.out.println("Cuantas capitulos tiene?");
			int capitulos = lector.nextInt();
		
		for(int i=0; i<arrayLib.length; i++) {
			if(arrayLib[i] == null) {
				arrayLib[i] = new Libro(titulo,autor,fecha,genLiterario,iSBN,capitulos);
				break;
			}
			}
			}	
	public static void bajaLibro(Libro[] arrayLib, Scanner lector) {
		System.out.println("Ingresa el codigo ISBN del Libro: ");
		int iSBN = lector.nextInt();
		for(int i=0; i<arrayLib.length; i++) {
			if(arrayLib[i] != null && arrayLib[i].getISBN() == iSBN) {
				arrayLib[i] = null;
				break;
			}
			}
			}
	public static void modifLibro(Libro[] arrayLib, Scanner lector) {
		System.out.println("Ingresa el codigo del libro a modificar: ");
		int ISBN = lector.nextInt();
		for(int i=0; i<arrayLib.length; i++) {
			if(arrayLib[i] != null && arrayLib[i].getISBN() == ISBN) {
				System.out.println("Libro encontrado");
				System.out.println("Ingresa el nuevo valor del codigo ISBN del libro: ");
					int iSBN = lector.nextInt();
					arrayLib[i].setISBN(iSBN);
				break;
			}else {
				System.out.println("No se encontro ningun Libro con ese Codigo !!");
			}
			}
			}
	public static void listarLibro(Libro[] arrayLib) {
		
		for(int i=0; i<arrayLib.length; i++) {
			if(arrayLib[i] != null) {
				System.out.print("Titulo:"+ arrayLib[i].getTitulo());
				System.out.print(" Autor:"+ arrayLib[i].getAutor());
				System.out.print(" Fecha:"+ arrayLib[i].getFecha());
				System.out.print(" Genero Literario:"+ arrayLib[i].getGenLiterario());
				System.out.print(" ISBN:"+ arrayLib[i].getISBN());
				System.out.println(" Capitulos: "+arrayLib[i].getCapitulos());
			}else {
				System.out.println("Pos N°" + i + "es null");
			}
			}
			}
	public static void altaRevista(Revista[] arrayRev, Scanner lector) {
		
		System.out.println("Cual es el titulo?");
			String titulo = lector.next();
		System.out.println("Quien es el autor?");
			String autor = lector.next();
		System.out.println("En que fecha se publicó?");
			String fecha = lector.next();
		System.out.println("Cual edicion es?");
			String edicion = lector.next();
		System.out.println("Que perioridad tiene?");
			String perioridad = lector.next();
		System.out.println("A que seccion pertenece?");
			String seccion = lector.next();
		
		for(int i=0; i<arrayRev.length; i++) {
			if(arrayRev[i] == null) {
				arrayRev[i] = new Revista(titulo,autor,fecha,edicion,perioridad,seccion);
				break;
			}
			}
			}	
	public static void bajaRevista(Revista[] arrayRev, Scanner lector) {
		System.out.println("Ingresa el titulo de la revista: ");
		String titulo = lector.next();
		for(int i=0; i<arrayRev.length; i++) {
			if(arrayRev[i] != null && arrayRev[i].getTitulo().equals(titulo)) {
				arrayRev[i] = null;
				if (arrayRev[i] == null){
					System.out.println("Borrado exitosamente !!");
				}
				break;
			}
			}
			}
	public static void modifRevista(Revista[] arrayRev, Scanner lector) {
		System.out.println("Ingresa el titulo de la Revista a modificar: ");
			String titulo = lector.next();
		for(int i=0; i<arrayRev.length; i++) {
			if(arrayRev[i] != null && arrayRev[i].getTitulo().equals(titulo)) {
				System.out.println("Revista encontrada");
				System.out.println("Ingresa el nuevo titulo de la Revista: ");
					String titulo2 = lector.next();
					arrayRev[i].setTitulo(titulo2);
				break;
			}else {
				System.out.println("No se encontro ninguna Revista con ese Titulo !!");
			}
			}
			}
	public static void listarRevista(Revista[] arrayRev) {
		
		for(int i=0; i<arrayRev.length; i++) {
			if(arrayRev[i] != null) {
				System.out.print("Titulo:"+ arrayRev[i].getTitulo());
				System.out.print(" Autor:"+ arrayRev[i].getAutor());
				System.out.print(" Fecha:"+ arrayRev[i].getFecha());
				System.out.print(" Edicion:"+ arrayRev[i].getEdicion());
				System.out.print(" Perioridad:"+ arrayRev[i].getPerioridad());
				System.out.println(" Seccion:"+ arrayRev[i].getSeccion());

				
			}else {
				System.out.println("Pos N°" + i + "es null");
			}
			}
			}
	public static void altaArtCientifico(ArtCientifico[] arrayCie, Scanner lector) {
		
		System.out.println("Cual es el titulo?");
			String titulo = lector.next();
		System.out.println("Quien es el autor?");
			String autor = lector.next();
		System.out.println("En que fecha se publicó?");
			String fecha = lector.next();
		System.out.println("Cual es la fuente cientifica?");
			String fueCientifica = lector.next();
		System.out.println("Cuantas citas de investigadores tuvo?");
			String numCitas = lector.next();
		System.out.println("Cual es el codigo DOI?");
			int dOI = lector.nextInt();
		
		for(int i=0; i<arrayCie.length; i++) {
			if(arrayCie[i] == null) {
				arrayCie[i] = new ArtCientifico(titulo,autor,fecha,fueCientifica,numCitas,dOI);
				break;
			}
			}
			}	
	public static void bajaArtCientifico(ArtCientifico[] arrayCie, Scanner lector) {
		System.out.println("Ingresa el codigo DOI del Articulo Cientifico: ");
		int dOI = lector.nextInt();
		for(int i=0; i<arrayCie.length; i++) {
			if(arrayCie[i] != null && arrayCie[i].getDOI() == dOI) {
				arrayCie[i] = null;
				if (arrayCie[i] == null){
					System.out.println("Borrado exitosamente !!");
				}
				break;
			}
			}
			}
	public static void modifArtCientifico(ArtCientifico[] arrayCie, Scanner lector) {
		System.out.println("Ingresa el codigo DOI del Articulo Cientifico a modificar: ");
			String titulo = lector.next();
		for(int i=0; i<arrayCie.length; i++) {
			if(arrayCie[i] != null && arrayCie[i].getTitulo().equals(titulo)) {
				System.out.println("Articulo encontrado");
				System.out.println("Ingresa el nuevo codigo DOI: ");
					int dOI = lector.nextInt();
					arrayCie[i].setDOI(dOI);
				break;
			}else {
				System.out.println("No se encontro ningun Articulo con ese Codigo !!");
			}
			}
			}
	public static void listarArtCientifico(ArtCientifico[] arrayCie) {
		
		for(int i=0; i<arrayCie.length; i++) {
			if(arrayCie[i] != null) {
				System.out.print("Titulo: "+ arrayCie[i].getTitulo());
				System.out.print(" Autor: "+ arrayCie[i].getAutor());
				System.out.print(" Fecha: "+ arrayCie[i].getFecha());
				System.out.print(" Fuente Cientifica: "+ arrayCie[i].getFueCientifica());
				System.out.print(" Numero de Citas: "+ arrayCie[i].getNumCitas());
				System.out.println(" Codigo DOI: "+ arrayCie[i].getDOI());

				
			}else {
				System.out.println("Pos N°" + i + "es null");
			}
			}
			}
}
