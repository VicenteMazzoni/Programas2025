package TodoSobreInterfaces;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JToggleButtonEj {

    public static JFrame crearVentana() {
        JFrame ventana = new JFrame("JToggleButton");
        ventana.setSize(300, 180);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

        JToggleButton toggle = new JToggleButton("Componente: JToggleButton");
        JLabel estado = new JLabel("Estado: Apagado", SwingConstants.CENTER);

        toggle.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (toggle.isSelected()) {
                    estado.setText("Estado: Encendido");
                } else {
                    estado.setText("Estado: Apagado");
                }
            }
        });

        ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
        ventana.add(toggle);
        ventana.add(estado);

        return ventana;
    }
}
