package TodoSobreInterfaces;

import javax.swing.*;
import java.text.NumberFormat;

public class JFormattedTextFieldEj {

    public static JFrame crearVentana() {
        JFrame ventana = new JFrame("JFormattedTextField - Campo con formato");
        ventana.setSize(300, 150);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("JFormattedTextField");

        NumberFormat formato = NumberFormat.getIntegerInstance();
        JFormattedTextField campo = new JFormattedTextField(formato);
        campo.setValue(123);
        campo.setColumns(10);

        panel.add(label);
        panel.add(campo);

        ventana.add(panel);
        return ventana;
    }
}
