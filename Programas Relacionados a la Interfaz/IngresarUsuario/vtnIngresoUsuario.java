package IngresarUsuario;
import java.awt.*;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;
public class vtnIngresoUsuario extends JFrame{

	public vtnIngresoUsuario(){
		this.setTitle("Ejercicio - Ingresar Usuario"); 
		this.setSize(600, 400); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setLocationRelativeTo(null);
        //this.setLayout(new GridLayout(1,2));

		fncIngreseUsuario();
		
	}
	private void fncIngreseUsuario() {
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		this.add(panel1, BorderLayout.WEST);
		this.add(panel2, BorderLayout.NORTH);
		this.add(panel3, BorderLayout.CENTER);
		panel1.setLayout(new GridLayout(20, 20));
		panel3.setLayout(new BorderLayout());

		panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel1.setBackground(Color.GREEN);
		panel2.setBackground(Color.RED);
		panel3.setBackground(Color.YELLOW);
			JButton btnIniciarSesion1 = new JButton("Botoooooooooooooon");
		    JButton btnIniciarSesion2 = new JButton("Booooooooooooton");
			JButton btnIniciarSesion3 = new JButton();
			JButton btnIniciarSesion4 = new JButton();
			JButton btnIniciarSesion5 = new JButton("Skereeee");
			JButton btnIniciarSesion6 = new JButton("Skereeee");
			JButton btnIniciarSesion7 = new JButton("Skereeee");
			JButton btnIniciarSesion8 = new JButton("Skereeee");
			JSeparator stSeparador = new JSeparator();
			String[] nombresColumnas = {"ISBN", "Titulo", "Autor","Editorial"};

	        Object[][] datosTabla = {
	            {null, null, null, null},
	            {null, null, null, null},
	            {null, null, null, null},
	            {null, null, null, null}
	        };

	        JTable miTabla = new JTable(datosTabla, nombresColumnas);

	        JScrollPane panelDesplazable = new JScrollPane(miTabla);
	panel1.add(btnIniciarSesion1);
	panel1.add(btnIniciarSesion5);
	panel1.add(btnIniciarSesion6);
	panel1.add(btnIniciarSesion7);
	panel1.add(stSeparador);
	panel1.add(btnIniciarSesion8);
	panel2.add(btnIniciarSesion2);
	panel2.add(btnIniciarSesion3);
	panel2.add(btnIniciarSesion4);
	panel3.add(panelDesplazable);
	

			
	}
}
