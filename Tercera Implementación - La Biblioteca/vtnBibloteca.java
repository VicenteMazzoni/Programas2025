package vtnTerceraImplementacionBibloteca;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class vtnBibloteca extends JFrame{
	
	public vtnBibloteca() {
		this.setTitle("Gestion Biblioteca - Vicente"); 
		this.setSize(600, 400); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setLocationRelativeTo(null); 
		
		JPanel panel1 = new JPanel();
		this.add(panel1);
		
		Libro[] arrayLibro = new Libro[10];
		
		//ISBN
		JLabel lblIsbn = new JLabel("ISBN: ");
		JTextField txtIsbn = new JTextField(7);
			panel1.add(lblIsbn);
			panel1.add(txtIsbn);
		
		//AUTOR
		JLabel lblAutor = new JLabel("Autor: ");
		JTextField txtAutor = new JTextField(7);
			panel1.add(lblAutor);
			panel1.add(txtAutor);
		
		//AUTOR
		JLabel lblTitulo = new JLabel("Titulo: ");
		JTextField txtTitulo = new JTextField(7);
			panel1.add(lblTitulo);	
			panel1.add(txtTitulo);

		//BOTON REGISTRAR & EVENT
		JButton btnRegistrar = new JButton("Registrar");
			panel1.add(btnRegistrar);
		btnRegistrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String isbn = txtIsbn.getText();
				String autor = txtAutor.getText();
				String titulo = txtTitulo.getText();
				fncGuardarLibro(isbn,autor,titulo,arrayLibro);
				
				txtIsbn.setText(null);
				txtAutor.setText(null);
				txtTitulo.setText(null);
			}
		});
		
		//BOTON MOSTRAR Y EVENT
		JButton btnMostrar = new JButton("Mostrar");
			panel1.add(btnMostrar);
		btnMostrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fncMostrarLibro(arrayLibro);
			}
		});
	}
	// FUNCION PARA GUARDAR "LIBRO"
	private void fncGuardarLibro(String isbn, String autor, String titulo,Libro[] arrayLibro){
		for(int i = 0; i<arrayLibro.length; i++) { 
			if(arrayLibro[i] == null) {
				arrayLibro[i] = new Libro(isbn,autor,titulo);
				break;
				}
			}
		}
	private void fncMostrarLibro(Libro[] arrayLibro) {
		for(int i = 0; i<arrayLibro.length; i++) { 
			if (arrayLibro[i] != null) {
				System.out.println("El ISBN es: "+arrayLibro[i].getIsbn());
				System.out.println("EL Autor es: "+arrayLibro[i].getAutor());
				System.out.println("El Titulo es: "+arrayLibro[i].getTitulo());
				System.out.println("   ");
				}else {
					continue;
					
				}
			}
		}
}