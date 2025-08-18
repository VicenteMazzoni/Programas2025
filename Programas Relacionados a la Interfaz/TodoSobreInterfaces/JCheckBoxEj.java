package TodoSobreInterfaces;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JCheckBoxEj {

    public static JFrame crearVentana() {
        JFrame ventana = new JFrame("JCheckBox");
        ventana.setSize(300, 180);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        JCheckBox check = new JCheckBox("Componente: JCheckBox");
        JLabel estado = new JLabel("Estado: No seleccionado", SwingConstants.CENTER);

        check.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (check.isSelected()) {
                    estado.setText("Estado: Seleccionado");
                } else {
                    estado.setText("Estado: No seleccionado");
                }
            }
        });

        ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
        ventana.add(check);
        ventana.add(estado);

        return ventana;
    }
}
