package TuPrimerVentanYComponentes;
import java.awt.Font;
import javax.swing.*;
public class VentanaActividad extends JFrame {
	public VentanaActividad() {
		this.setTitle("Ventana de Prueba - Ramiro Sosa");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setLocationRelativeTo(null);
		FuncPanel();
	}
	private void FuncPanel() {
		JPanel panel1 = new JPanel();
		this.add(panel1);
		
		JLabel lblBienvenida = new JLabel("Bienvenido a mi Programa");
			lblBienvenida.setFont(new Font("arial",1,25));
			panel1.add(lblBienvenida);
		JLabel lblIngresa = new JLabel("Nombre:");
			lblIngresa.setFont(new Font("arial",0,15));
			panel1.add(lblIngresa);
		JTextField inpNombre = new JTextField(10);
			panel1.add(inpNombre);
		JButton butAceptar = new JButton("Aceptar");
			panel1.add(butAceptar);
			
		
	}
}
