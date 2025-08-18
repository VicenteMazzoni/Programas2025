package VentanaDividida;
import javax.swing.*;
public class Logica {
	public static void main(String[] args) {
		Presentacion pres1 = new Presentacion();
		pres1.setVisible(true);
	}
	public boolean fnc(String nombre) {
		boolean resultado = false;
		
		if (nombre.length() == 5) {
			System.out.println("Hola");
			Persona per1 = new Persona(nombre, nombre);
			System.out.println(per1.getNombre());
			resultado = true;
		
		}
		return resultado;
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 
