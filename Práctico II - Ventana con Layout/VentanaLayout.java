package EjercicioVentana2;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;
public class VentanaLayout extends JFrame {
	public VentanaLayout() {
		this.setTitle("Registrar Usuario"); 
		this.setSize(600, 400); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setLocationRelativeTo(null);
		
		fncRegistrarUsuario();
	}
	private void fncRegistrarUsuario() {
		JPanel panel1 = new JPanel(new FlowLayout());
		this.add(panel1);
		
		JLabel lblNombre = new JLabel("Nombre  ");
        	lblNombre.setFont(new Font("Arial", Font.BOLD, 16));
        JLabel lblApellido = new JLabel("Apellido  ");
        	lblApellido.setFont(new Font("Arial", Font.BOLD, 16));
        JLabel lblCedula = new JLabel("Cedula  ");
        	lblCedula.setFont(new Font("Arial", Font.BOLD, 16));
        JLabel lblEdad = new JLabel("Edad   ");
        	lblEdad.setFont(new Font("Arial", Font.BOLD, 16));
        JLabel lblRol = new JLabel("Rol  ");
        	lblRol.setFont(new Font("Arial", Font.BOLD, 16));
        	
        JTextField txtNombre = new JTextField(5);
        JTextField txtApellido = new JTextField(5);
        JTextField txtCedula = new JTextField(5);
        JTextField txtEdad = new JTextField(5);

        JComboBox cmbGenero = new JComboBox();
        
        JButton btnRegistrar = new JButton("Registrar");
        
        panel1.add(lblNombre);
        	panel1.add(txtNombre);
        panel1.add(lblApellido);
    		panel1.add(txtApellido);
        panel1.add(lblCedula);
    		panel1.add(txtCedula);
        panel1.add(lblEdad);
        	panel1.add(txtEdad);
        panel1.add(lblRol);
        	panel1.add(cmbGenero);
        panel1.add(btnRegistrar);

	}
}
