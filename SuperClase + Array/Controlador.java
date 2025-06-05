package Paquete;
import java.util.Scanner;

public class Controlador {

	public static void main(String[] args) {
		
		int opcion;
		Estudiante[] arreglo = new Estudiante[10];
		int cantidadRegistros = 0;
		
		
		do {
			
			Scanner lector = new Scanner(System.in);
			
			System.out.println("Bienvenido");
			System.out.println("Ingresa opcion deseada:");
			System.out.println("1- Ingresar Estudiante");
			System.out.println("2- Mostrar Lista de Estudiantes");
			System.out.println("3- Salir");
			opcion = lector.nextInt();
			
			
			switch (opcion) {
			case 1:
				altaEstudiante();
				
				System.out.println("Ingresa CI: ");
				int ci = lector.nextInt();
				System.out.println("Ingresa Nombre: ");
				String nombre = lector.next();
				System.out.println("Ingresa Apellido: ");
				String apellido = lector.next();
				
				arreglo[cantidadRegistros] = new Estudiante(ci, nombre, apellido);
								
				cantidadRegistros++;
											
				break;
				
			case 2:
				listarEstudiantes(arreglo);
				break;
				
			case 3:
				System.out.println("Se terminó");
				break;

			default:
				System.out.println("Opcion no disponible");
				break;
			}
			
		} while (opcion!=3);

	}
	
	public static void listarEstudiantes(Estudiante[] arreglo) {
		
		for(int i=0; i<arreglo.length; i++) {
			if(arreglo[i] != null) {
				System.out.print("Estudiante N°"+ i +" CI: " + arreglo[i].getCI());
				System.out.print(" NOMBRE: " + arreglo[i].getNombre());
				System.out.println(" APELLIDO: " + arreglo[i].getApellido());
			}else {
				System.out.println("Pos N°" + i + "es null");
			}
			
		}
		
		
	}

}
