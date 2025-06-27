package GestionPersonal;
import java.util.Scanner;
public class ControladorGestionPersonal {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		Encargados enc1 = new Encargados ("Vicente","Mazzoni","15 Horas",1000,"Sector A",14);
		Alternos alt1 = new Alternos("Nicolas","Perez","10 Horas",5000,"Limpiador",3);
		Tecnicos tec1 = new Tecnicos("Tania","Pereira","8 Horas",3500,"Tecnico en Informatica","Especialista en Programacion");
		
		System.out.println("-- Bienvenido al Gestor de Personal --");
		int op;
		do {
			System.out.println("Ingresa la opcion que desees: ");
			System.out.println("1- Encargado");
			System.out.println("2- Alterno");
			System.out.println("3- Tecnico");
			System.out.println("4- Salir");
			op = lector.nextInt();
			
			switch (op) {
			case 1:
				enc1.mail();
				break;
			case 2:
				alt1.mail();
				break;
			case 3:
				tec1.mail();
			}
			}while (op != 4);
	}

}
