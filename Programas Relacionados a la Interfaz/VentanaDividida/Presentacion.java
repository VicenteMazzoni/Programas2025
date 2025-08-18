package VentanaDividida;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Presentacion extends JFrame {
	Logica gestor = new Logica();
	public Presentacion(){
		
	this.setTitle("JFrame - 3-0"); //Estable el titulo de la ventana
	this.setSize(600, 400); //Tamaño en PX. Primero el ancho y luego el largo
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Accion default al cerrar
	this.setLocationRelativeTo(null); //posicion en la que inicia la ventana
	
	JPanel panel1 = new JPanel();
		this.add(panel1);
	
	JLabel lblNombre = new JLabel("Nombre: ");
	
	JTextField txtNombre = new JTextField(7);
	
	JButton btnChequear = new JButton("Chequear");
	
	panel1.add(lblNombre);
	panel1.add(txtNombre);
	panel1.add(btnChequear);
	
	btnChequear.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
				if (gestor.fnc(txtNombre.getText())) {
					panel1.add(lblExitoso);				
					JLabel lblExitoso = new JLabel("El registro fue exitoso");
					}else {
						JLabel lblExitosoNo = new JLabel("El registro fue poco exitoso");

					}
		}
	});
	}
	
}
