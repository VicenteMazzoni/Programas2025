package Paquete;

public class Estudiante {
	
	private int CI;
	private String Nombre;
	private String Apellido;

	public Estudiante(int cI, String nombre, String apellido) {
		CI = cI;
		Nombre = nombre;
		Apellido = apellido;
	}

	public int getCI() {
		return CI;
	}

	public void setCI(int cI) {
		CI = cI;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

}
