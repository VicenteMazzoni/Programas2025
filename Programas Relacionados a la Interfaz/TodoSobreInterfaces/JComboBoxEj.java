package TodoSobreInterfaces;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JComboBoxEj {

    public static JFrame crearVentana() {
        JFrame ventana = new JFrame("JComboBox");
        ventana.setSize(300, 180);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        String[] opciones = {"Opción 1", "Opción 2", "Opción 3"};
        JComboBox<String> combo = new JComboBox<>(opciones);
        JLabel etiqueta = new JLabel("Componente: JComboBox - Selecciona una opción", SwingConstants.CENTER);

        combo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta.setText("Componente: JComboBox - Seleccionaste: " + combo.getSelectedItem());
            }
        });

        ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
        ventana.add(combo);
        ventana.add(etiqueta);

        return ventana;
    }
}
