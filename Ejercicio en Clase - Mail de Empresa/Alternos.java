package GestionPersonal;

import java.util.Scanner;

public class Alternos extends Trabajadores implements Gmail{
	String puesto;
	int cantPuestos;
	
	public Alternos(String nombre, String apellido, String horario, int sueldo, String puesto, int cantPuestos) {
		super(nombre, apellido, horario, sueldo);
		this.puesto = puesto;
		this.cantPuestos = cantPuestos;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public int getCantPuestos() {
		return cantPuestos;
	}
	public void setCantPuestos(int cantPuestos) {
		this.cantPuestos = cantPuestos;
	}
	
	@Override
	public void mail() {
		Scanner lector = new Scanner(System.in);
		int op;
	System.out.println("-- Bienvenido Alterno --");
	System.out.println("A quien deseas enviarle el mail?");
	System.out.println("1- Tecnicos");
	System.out.println("2- Encargado");
	System.out.println("3- Salir de enviar mail Alternos");
	op = lector.nextInt();
	switch (op) {
	case 1:
		System.out.println("Envia el mail para el tecnico:");
		String mailTecnico = lector.next();
		break;
	case 2: System.out.println("Disculpa pero debido a tu cargo no puedes enviarle un mail a los Encargados");
		break;
	case 3:
		System.out.println("Saliste de Envair Mail");
		}
	}
}
