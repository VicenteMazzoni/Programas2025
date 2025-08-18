package CalculadoraVnt;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class vtnCalculadora extends JFrame{
	public vtnCalculadora() {
	this.setTitle("JFrame - Calculadora"); 
	this.setSize(600, 400); 
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLocationRelativeTo(null);
	JPanel panel1 = new JPanel();
	this.add(panel1);
	JLabel lblNum1 = new JLabel("Numero 1:");
	JLabel lblNum2 = new JLabel("Numero 2:");
	
	JTextField txtNum1 = new JTextField(8);
	JTextField txtNum2 = new JTextField(8);
	
	panel1.add(lblNum1);
	panel1.add(txtNum1);
	panel1.add(lblNum2);
	panel1.add(txtNum2);
	
	//SUMA
	JButton btnSuma = new JButton("+");
		panel1.add(btnSuma);
	btnSuma.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			int num1Suma = Integer.parseInt(txtNum1.getText()) ;
			int num2Suma = Integer.parseInt(txtNum2.getText()) ;
		JLabel lblResultadoSuma = new JLabel("Resultado suma: "+(num1Suma + num2Suma));
			panel1.add(lblResultadoSuma);
			}
	});
	// RESTA
	JButton btnResta = new JButton("-");
		panel1.add(btnResta);
	btnResta.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
		int num1Resta = Integer.parseInt(txtNum1.getText()) ;
		int num2Resta = Integer.parseInt(txtNum2.getText()) ;
	JLabel lblResultadoResta = new JLabel("Resultado Resta: "+(num1Resta - num2Resta));
		panel1.add(lblResultadoResta);
		}
});
	// MULTIPLICACION
	JButton btnMulti = new JButton("x");
		panel1.add(btnMulti);
	btnMulti.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			int num1Multi = Integer.parseInt(txtNum1.getText()) ;
			int num2Multi = Integer.parseInt(txtNum2.getText()) ;
				JLabel lblResultadoMulti = new JLabel("Resultado Multiplicacion: "+(num1Multi * num2Multi));
			panel1.add(lblResultadoMulti);
		}
});
	// DIVISION
	JButton btnDivi = new JButton("/");
		panel1.add(btnDivi);
		btnDivi.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1Divi = Integer.parseInt(txtNum1.getText()) ;
				int num2Divi = Integer.parseInt(txtNum2.getText()) ;
					JLabel lblResultadoDivi = new JLabel("Resultado Division: "+(num1Divi / num2Divi));
				panel1.add(lblResultadoDivi);
		}
});
		}
	}
