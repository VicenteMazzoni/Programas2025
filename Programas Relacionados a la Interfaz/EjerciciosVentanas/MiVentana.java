package EjerciciosVentanas;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MiVentana extends JFrame {
		
	public MiVentana() {
		this.setTitle("Titulo de mi ventana"); //Estable el titulo de la ventana
		this.setSize(600, 400); //Tamaño en PX. Primero el ancho y luego el largo
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Accion default al cerrar
		this.setLocationRelativeTo(null); //posicion en la que inicia la ventana
		
		CosasJPanel();
		
	}
	private void CosasJPanel () {
		JPanel panel1 = new JPanel(); // Creamos el panel
		this.add(panel1); // Le agregamos el panel a JFrame
		
		JLabel Usuario1 = new JLabel("Usuario: "); //Creamos una etiqueta
			Usuario1.setForeground(Color.blue); // Le agregamos color a una etiqueta
			Usuario1.setFont(new Font("arial",1, 20)); // tipo de texto, negrita, y el tamaño de la etiqueta
			panel1.add(Usuario1); // Le asiganmos la etiqueta al panel
		JTextField inp1 = new JTextField(10); // Creamos el inmput 1
			panel1.add(inp1);	//Lo asiganmos al panel
		JLabel contra1 = new JLabel("Contraseña:");
			contra1.setForeground(Color.blue);
			contra1.setFont(new Font("arial",1, 20));
			panel1.add(contra1);	
		JTextField inp2 = new JTextField(10); // ademas columnas, serian el 10
			panel1.add(inp2);
		//-- Crear Evento -- AL pulsar el boton -- Accion Listener
		JButton iniciaSesion = new JButton("Iniciar Sesion"); //Creamos un boton (que por ahora no hace nada)
			panel1.add(iniciaSesion); //Se lo asignamos al panel
		JLabel saludarUsuario =new JLabel();
			saludarUsuario.setFont(new Font("arial",1,20));
			panel1.add(saludarUsuario);
		
		// -- Agregamos el oyente directamente como clase anónima --
			iniciaSesion.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					saludarUsuario.setText("Hola "+inp1.getText());
				}
			});
			
		//-- Crear caja de texto --
			
		/*JTextField cajaTexto = new JTextField("982",10);
			System.out.println("Valor del texto en la caja: "+ cajaTexto.getText());
			panel1.add(cajaTexto);
		
		//-- Crear Area Texto --
		 
		JTextArea areaTexto = new JTextArea();
			areaTexto.setColumns(15);
			panel1.add(areaTexto); */
			
		
		/*inp1.setColumns(10); // Le agregamos columnas al lugar ...
		inp2.setColumns(10); // donde escribimos el texto
		*/
		panel1.setBackground(Color.yellow ); //Cambiamos el oclor del panel a Amarrillo
		
	}
	
	}
	


