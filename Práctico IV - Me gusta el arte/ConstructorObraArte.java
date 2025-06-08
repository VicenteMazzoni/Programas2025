package ObrasArte;
import java.util.Scanner;
public class ConstructorObraArte {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
	System.out.println("|-------------|");
	System.out.println("|-- Pintura --|");
	System.out.println("|-------------|");
	System.out.println(" ");
		Pintura pi1 = new Pintura (null,null,0,null,0);
	System.out.println("Como es el nombre de la Pintura? :");
		pi1.setTitulo(lector.next());
	System.out.println("Como se llama el autor? :");
		pi1.setAutor(lector.next());
	System.out.println("En que año se creó? :");
		pi1.setAño(lector.nextInt());
	System.out.println("Que tipo de pinutra se usó? :");
		pi1.setTipPintura(lector.next());
	System.out.println("De que tamaño es la hoja, en cm? :");
		pi1.setTamHoja(lector.nextInt());
	System.out.println(" ");
		
	System.out.println("|---------------|");
	System.out.println("|-- Escultura --|");
	System.out.println("|---------------|");
	System.out.println(" ");	
		Escultura es1 = new Escultura (null,null,0,null,null);
	System.out.println("Como es el nombre de la Escultura? :");
		es1.setTitulo(lector.next());
	System.out.println("Como se llama el autor? :");
		es1.setAutor(lector.next());
	System.out.println("En que año se creó? :");
		es1.setAño(lector.nextInt());
	System.out.println("Que material se usó? :");
		es1.setMaterial(lector.next());
	System.out.println("Cual fue el tipo de esculpido que se usó? :");
		es1.setTipEsculpido(lector.next());
	System.out.println(" ");
	
	System.out.println("|----------------|");
	System.out.println("|-- Fotografía --|");
	System.out.println("|----------------|");
	System.out.println(" ");
		Fotografia fo1 = new Fotografia (null,null,0,null,null);
	System.out.println("Como es el nombre que le das a la Fotografia? :");
		fo1.setTitulo(lector.next());
	System.out.println("Como se llama el fotografo? :");
		fo1.setAutor(lector.next());
	System.out.println("En que año se sacó? :");
		fo1.setAño(lector.nextInt());
	System.out.println("Que camara se usó? :");
		fo1.setCamara(lector.next());
	System.out.println("Cual resolucion tiene la fotografia? :");
		fo1.setResolucion(lector.next());
	
	System.out.println("|| PINTURA ||");
	System.out.println("Titulo: "+pi1.getTitulo()+" - Autor: "+pi1.getAutor()+" - Año de Creación: "+pi1.getAño());
	System.out.println("Tipo Pintura: "+pi1.getTipPintura()+" - Tamaño hoja: "+pi1.getTamHoja()+"cm");
	System.out.println(" ");
	System.out.println("|| ESCULPIDO ||");
	System.out.println("Titulo: "+es1.getTitulo()+" - Autor: "+es1.getAutor()+" - Año de Creación: "+es1.getAño());
	System.out.println("Material: "+es1.getMaterial()+" - Tecnica Esculpido: "+es1.getTipEsculpido());
	System.out.println("");
	System.out.println("|| FOTOGRAFÍA ||");
	System.out.println("Titulo: "+fo1.getTitulo()+" - Autor: "+fo1.getAutor()+" - Año de Creación: "+fo1.getAño());
	System.out.println("Camara: "+fo1.getCamara()+" - Resolucion: "+fo1.getResolucion());

	}

}
