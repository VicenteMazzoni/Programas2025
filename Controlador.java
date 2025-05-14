package VehiculoAutosControlador;
import java.util.Scanner;
public class Controlador {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		Auto auto1 = new Auto("matricula","marca", 4);

		System.out.println("Ingresa la matricula: ");
			auto1.setMatricula(lector.nextLine());
		System.out.println("Ingresa la marca: ");
			auto1.setMarca(lector.nextLine());
		System.out.println("Ingresa la cantidad de ventanas en num enteros");
			auto1.setVentanas(lector.nextInt());	
	
		//System.out.println("Matricula: "+ auto1.getMatricula()+" Marca: "+ auto1.getMarca()+ " Ventanas: "+ auto1.getVentanas());
		
		System.out.println(auto1);
	}

}
