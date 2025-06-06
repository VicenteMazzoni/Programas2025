package ActividadConstructora;
import java.util.Scanner;
public class ControladorConstructora {

	public static void main(String[] args) {
		
	Scanner lector= new Scanner(System.in);
		System.out.println("-- Casa --");
		System.out.println("-----------");
	Casa ca1 = new Casa (null,null,0,0,0);
	System.out.println("Ingrese el material de la casa:");
		ca1.setMaterial(lector.next());
	System.out.println("Ingrese la direccion de la casa:");
		ca1.setDireccion(lector.next());
	System.out.println("Ingrese la cantidad de ventanas de la casa:");
		ca1.setVentanas(lector.nextInt());
	System.out.println("Ingrese tamaño del patio en metros cuadrados:");
		ca1.setTamPatio(lector.nextInt());
	System.out.println("Ingrese la cantidad de pisos en la casa:");
		ca1.setPisos(lector.nextInt());
	
		System.out.println(" ");
		System.out.println("-- Apartamento --");
		System.out.println("-------------------");
	Apartamento ap1 = new Apartamento (null,null,0,null,false);
		
	System.out.println("Ingrese el material del Apartamento:");
		ap1.setMaterial(lector.next());
	System.out.println("Ingrese la direccion del Apartamento:");
		ap1.setDireccion(lector.next());
	System.out.println("Ingrese la cantidad de ventanas en el Apartamento:");
		ap1.setVentanas(lector.nextInt());
	System.out.println("Ingrese el Block del Apartamento:");
		ap1.setBlock(lector.next());
	System.out.println("En el apartamento hay Piscina?? :");
		ap1.setPiscina(lector.nextBoolean());
		
	System.out.println(" ");
	System.out.println("|| CASA ||");
	System.out.println("Material: "+ca1.getMaterial()+" - Direccion: "+ca1.getDireccion()+" - Ventanas: "+ca1.getVentanas());
	System.out.println("Tamaño patio: "+ca1.getTamPatio()+"m2 - Pisos"+ca1.getPisos());
	
	System.out.println(" ");
	System.out.println("|| APARTAMENTO ||");
	System.out.println("Material: "+ap1.getMaterial()+" - Direccion: "+ap1.getDireccion()+" - Ventanas: "+ap1.getVentanas());
	System.out.println("Block: "+ap1.getBlock()+" - Hay Piscina?: "+ap1.isPiscina());
	}

}
