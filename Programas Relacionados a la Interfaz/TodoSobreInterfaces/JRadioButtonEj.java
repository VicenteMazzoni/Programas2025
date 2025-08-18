package TodoSobreInterfaces;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButtonEj {

    public static JFrame crearVentana() {
        JFrame ventana = new JFrame("JRadioButton");
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        JRadioButton opcion1 = new JRadioButton("Opción 1");
        JRadioButton opcion2 = new JRadioButton("Opción 2");
        JLabel etiqueta = new JLabel("Componente: JRadioButton - Ninguna seleccionada", SwingConstants.CENTER);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(opcion1);
        grupo.add(opcion2);

        opcion1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta.setText("Componente: JRadioButton - Opción 1 seleccionada");
            }
        });

        opcion2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta.setText("Componente: JRadioButton - Opción 2 seleccionada");
            }
        });

        ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
        ventana.add(opcion1);
        ventana.add(opcion2);
        ventana.add(etiqueta);

        return ventana;
    }
}
