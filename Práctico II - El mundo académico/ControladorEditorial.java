package Editorial;
import java.util.Scanner;
public class ControladorEditorial {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		
		System.out.println("-- Libro --");
		System.out.println("--------------");
			Libro li1 = new Libro (null,null,null,null,0,0);
		System.out.print("Ingrese el titulo del libro: ");
			li1.setTitulo(lector.nextLine());
		System.out.print("Ingrese el autor del libro: ");
			li1.setAutor(lector.nextLine());
		System.out.print("Ingrese la fecha de publicacion del libro: ");
			li1.setFecha(lector.nextLine());
		System.out.print("Ingrese el genero literario del Libro: ");
			li1.setGenLiterario(lector.nextLine());
		System.out.print("Ingrese el codigo ISBN del libro: ");
			li1.setISBN(lector.nextInt());
		System.out.print("Ingrese la cantidad de capitulos del libro: ");
			li1.setCapitulos(lector.nextInt());
		
			System.out.println(" ");	
		System.out.println("-- Revista --");
		System.out.println("---------------");
			Revista rev1 = new Revista (null,null,null,null,null,null);
		System.out.print("Ingrese el titulo de la Revista: ");
			rev1.setTitulo(lector.next());
		System.out.print("Ingrese el autor de la Revista: ");
			rev1.setAutor(lector.next());
		System.out.print("Ingrese la fecha de publicacion de la Revista: ");
			rev1.setFecha(lector.next());
		System.out.print("Ingrese la edicion de la Revista: ");
			rev1.setEdicion(lector.next());
		System.out.print("Ingrese la periodidad de la Revista (semanal,etc): ");
			rev1.setPerioridad(lector.next());
		System.out.print("Ingrese la seccion de la Revista: ");
			rev1.setSeccion(lector.next());
			
		System.out.println(" ");
		System.out.println("-- Art Científico --");
		System.out.println("----------------------");
			ArtCientifico cie1 = new ArtCientifico (null,null,null,null,null,0);
		System.out.print("Ingrese el titulo del Articulo Cientifico: ");
			cie1.setTitulo(lector.next());
		System.out.print("Ingrese el autor del Articulo Cientifico: ");
			cie1.setAutor(lector.next());
		System.out.print("Ingrese la fecha de publicacion del Articulo Cientifico: ");
			cie1.setFecha(lector.next());
		System.out.print("Ingrese la fuente cientifica que contiene el Articulo: ");
			cie1.setFueCientifica(lector.next());
		System.out.print("Cuantas veces fue citado el articulo por otros investigadores: ");
			cie1.setNumCitas(lector.nextInt());
		System.out.print("Ingrese el codigo DOI del Articulo: ");
			cie1.setDOI(lector.nextInt());
		
		System.out.println(" ");
		System.out.println("|| LIBRO ||");
		System.out.println("Titulo: "+li1.getTitulo()+" - Autor: "+li1.getAutor()+" - Fecha: "+li1.getFecha() );
		System.out.println("Genero Literario: "+li1.getGenLiterario()+" - Codigo ISBN: "+li1.getISBN()+" - Capitulos: "+li1.getCapitulos());
		System.out.println(" ");
		System.out.println("|| REVISTA ||");
		System.out.println("Titulo: "+rev1.getTitulo()+" - Autor: "+rev1.getAutor()+" - Fecha: "+rev1.getFecha() );
		System.out.println("Edicion: "+rev1.getEdicion()+" - Perioridad: "+rev1.getPerioridad()+" - Seccion: "+rev1.getPerioridad());
		System.out.println("");
		System.out.println("|| ART CIENTIFICO ||");
		System.out.println("Titulo: "+cie1.getTitulo()+" - Autor: "+cie1.getAutor()+" - Fecha: "+cie1.getFecha() );
		System.out.println("Fuente Cientifica: "+cie1.getFueCientifica()+" - Veces de citacion del articulo: "+cie1.getNumCitas()+" - Codigo DOI: "+cie1.getDOI());
	}

}
