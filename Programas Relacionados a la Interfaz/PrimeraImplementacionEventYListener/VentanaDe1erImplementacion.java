package PrimeraImplementacionEventYListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class VentanaDe1erImplementacion  extends JFrame {
	public VentanaDe1erImplementacion() {
		this.setTitle("JFrame - Peñarol noma"); //Estable el titulo de la ventana
		this.setSize(600, 400); //Tamaño en PX. Primero el ancho y luego el largo
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Accion default al cerrar
		this.setLocationRelativeTo(null); //posicion en la que inicia la ventana
		
		JPanel panel1 = new JPanel(new GridLayout(3,2,10,10));
			this.add(panel1);
		Persona[] arrayPersona = new Persona[10];
		
		JLabel lblNombre = new JLabel("Nombre: ");
			lblNombre.setFont(new Font("arial",1,30));
		JLabel lblApellido = new JLabel("Apellido: ");
			lblApellido.setFont(new Font("arial",1,30));
		
		JTextField txtNombre = new JTextField(7);
		JTextField txtApellido = new JTextField(7);

		JButton btnRegistrar = new JButton("Registrar");
		JButton btnMostrar = new JButton("Mostrar");
		
		panel1.add(lblNombre);
			panel1.add(txtNombre);
		panel1.add(lblApellido);
			panel1.add(txtApellido);
		
		panel1.add(btnRegistrar);
		panel1.add(btnMostrar);
		//Evento Alta Persona
		btnRegistrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nombre = txtNombre.getText();
				String apellido = txtApellido.getText();
				fncGuardarPersona(nombre, apellido, arrayPersona);
				txtNombre.setText(null);
				txtApellido.setText(null);

				}
		});
		btnMostrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fncMostrarPersona(arrayPersona);

			}
		});
		
		}
	private void fncGuardarPersona(String nombre, String apellido, Persona[] arrayPersona){
		for(int i = 0; i<arrayPersona.length; i++) {
			if(arrayPersona[i] == null) {
				arrayPersona[i] = new Persona(nombre, apellido);
				break;
			}
		}
	}
	private void fncMostrarPersona(Persona[] arrayPersona) {
		for(int i = 0; i<arrayPersona.length; i++) {
		if(arrayPersona != null) {
			System.out.println("Nombre: "+ arrayPersona[i].getNombre());
		System.out.println("Apellido: "+ arrayPersona[i].getApellido());
		}else {
		continue;
		}
		break;}
		}
}