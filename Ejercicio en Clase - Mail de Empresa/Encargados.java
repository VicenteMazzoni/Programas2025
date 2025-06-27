package GestionPersonal;
import java.util.Scanner;
public class Encargados extends Trabajadores implements Gmail{
		String sector;
		int canPersonas;
		public Encargados(String nombre, String apellido, String horario, int sueldo, String sector, int canPersonas) {
			super(nombre, apellido, horario, sueldo);
			this.sector = sector;
			this.canPersonas = canPersonas;
		}
		public String getSector() {
			return sector;
		}
		public void setSector(String sector) {
			this.sector = sector;
		}
		public int getCanPersonas() {
			return canPersonas;
		}
		public void setCanPersonas(int canPersonas) {
			this.canPersonas = canPersonas;
		}
		
		@Override
		public void mail() {
			Scanner lector = new Scanner(System.in);
			int op;
		System.out.println("-- Bienvenido Encargado --");
		System.out.println("A quien deseas enviarle el mail?");
		System.out.println("1- Tecnicos");
		System.out.println("2- Alternos");
		System.out.println("3- Salir de enviar mail Encargado");
		op = lector.nextInt();
		switch (op) {
		case 1:
			System.out.println("Envia el mail para el tecnico:");
			String mailTecnico = lector.next();
			break;
		case 2: System.out.println("Disculpa pero debido a tu cargo no puedes enviarle un mail a los Alternos");
			break;
		case 3:
			System.out.println("Saliste de Envair Mail");
			}
		}
		
	}


