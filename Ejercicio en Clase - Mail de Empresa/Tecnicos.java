package GestionPersonal;

import java.util.Scanner;

public class Tecnicos extends Trabajadores implements Gmail{

	String tituloTecnico, espTecnica;

	public Tecnicos(String nombre, String apellido, String horario, int sueldo, String tituloTecnico,
			String espTecnica) {
		super(nombre, apellido, horario, sueldo);
		this.tituloTecnico = tituloTecnico;
		this.espTecnica = espTecnica;
	}

	public String getTituloTecnico() {
		return tituloTecnico;
	}

	public void setTituloTecnico(String tituloTecnico) {
		this.tituloTecnico = tituloTecnico;
	}

	public String getEspTecnica() {
		return espTecnica;
	}

	public void setEspTecnica(String espTecnica) {
		this.espTecnica = espTecnica;
	}
	
	@Override
	public void mail() {
		Scanner lector = new Scanner(System.in);
		int op;
	System.out.println("-- Bienvenido Tecnico --");
	System.out.println("A quien deseas enviarle el mail?");
	System.out.println("1- Encargados");
	System.out.println("2- Alternos");
	System.out.println("3- Salir de enviar mail Tecnico");
	op = lector.nextInt();
	switch (op) {
	case 1:
		System.out.println("Envia el mail para el Encargado:");
		String mailEncargado = lector.next();
		break;
	case 2:
		System.out.println("Envia el mail para el Alterno:");
		String mailAlterno = lector.next();
		break;
	case 3:
		System.out.println("Saliste de Envair Mail");
		}
	}
}
