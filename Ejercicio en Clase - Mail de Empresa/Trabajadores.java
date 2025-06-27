package GestionPersonal;

public class Trabajadores {
	String nombre, apellido, horario;
	int sueldo;
	public Trabajadores(String nombre, String apellido, String horario, int sueldo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.horario = horario;
		this.sueldo = sueldo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
}
