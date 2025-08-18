package CrearEventosNivelDificil;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class VentanaConEventosArrayFor extends JFrame {
	public VentanaConEventosArrayFor() {
		this.setTitle("Registrar Usuario - Vicente"); //Estable el titulo de la ventana
		this.setSize(600, 400); //Tamaño en PX. Primero el ancho y luego el largo
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Accion default al cerrar
		this.setLocationRelativeTo(null); //posicion en la que inicia la ventana
		
		JPanel panel1 = new JPanel();
			this.add(panel1);
		Persona[] arrayPersona = new Persona[10];
		
		JLabel lblNombre = new JLabel();
		JLabel lblApellido = new JLabel();
		JLabel lblEdad = new JLabel();
		 
		JTextField txtNombre = new JTextField(7);
		JTextField txtApellido = new JTextField(7);
		JTextField txtEdad = new JTextField(7);

		JButton btnRegistrar = new JButton("Registrar");
		JButton btnMostrar = new JButton("Mostrar");
		
		panel1.add(lblNombre);
			panel1.add(txtNombre);
		panel1.add(lblApellido);
			panel1.add(txtApellido);
		panel1.add(lblEdad);
			panel1.add(txtEdad);
		
		panel1.add(btnRegistrar);
		panel1.add(btnMostrar);
		//Evento Alta Persona
		btnRegistrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nombre = txtNombre.getText();
				String apellido = txtApellido.getText();
				int edad = Integer.parseInt(txtEdad.getText()) ;
				fncGuardarPersona(nombre, apellido, edad, arrayPersona);
				txtNombre.setText(null);
				txtApellido.setText(null);
				txtEdad.setText(null);

				}
		});
		btnMostrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fncMostrarPersona(arrayPersona);

			}
		});
		
		}
	private void fncGuardarPersona(String nombre, String apellido, int edad, Persona[] arrayPersona){
		for(int i = 0; i<arrayPersona.length; i++) {
			if(arrayPersona[i] == null) {
				arrayPersona[i] = new Persona(nombre, apellido, edad);
				break;
			}
		}
	}
	private void fncMostrarPersona(Persona[] arrayPersona) {
		for(int i = 0; i<arrayPersona.length; i++) {
		if(arrayPersona != null) {
			System.out.println("Nombre: "+ arrayPersona[i].getNombre());
		System.out.println("Apellido: "+ arrayPersona[i].getApellido());
		System.out.println("Edad: "+ arrayPersona[i].getEdad());
		}else {
		continue;
		}
		break;}
		}
}